import json
import os

careers = [
    "demonhunter", "hunter", "druid", "shaman", "rogue",
    "mage", "paladin", "priest", "warrior", "warlock", "neutral"
]


def to_camel(raw):
    return "".join(list(map(lambda x: x.capitalize(), raw.split("-"))))


def collect_kv(card, collect, key_getter, value_getter):
    k = key_getter(card)
    v = value_getter(card)
    if k == "" or k is None or v is None: return
    if k in collect and collect[k] != v:
        print("collect = ", collect, "key=" + k, "value=", v)
        raise Exception()
    collect[to_camel(k)] = v


def collect_key(card, collect, key_getter):
    k = key_getter(card)
    if isinstance(k, str):
        collect.add(to_camel(k))
    else:
        collect.add(k)


def generate_kv_enum(collect, class_name, value_name="id"):
    collect = dict(sorted(collect.items(), key=lambda item: item[1]))
    enums = "\n    ".join([f"{enum}({id})," for enum, id in collect.items()])
    source = f"""package tech.cuda.hsrl.common.enum

enum class {class_name}(val {value_name}: Int) {{
    {enums}
}}"""
    fp = open(f"../../kotlin/tech/cuda/hsrl/common/enum/{class_name}.kt", "w")
    fp.writelines(source)
    fp.close()


def generate_card_class(collect):
    classes = ",\n    ".join(collect).lstrip(",\n")
    source = f"""package tech.cuda.hsrl.common.enum

enum class CardClass {{
{classes}
}}"""
    fp = open("../../kotlin/tech/cuda/hsrl/common/enum/CardClass.kt", "w")
    fp.writelines(source)
    fp.close()


if __name__ == "__main__":
    card_set = {}
    card_class = {}
    card_rarity = {}
    card_type = {}
    minion_type = {}
    tmp = set()
    for career in careers:
        for _type in ['open', 'classical', 'standard']:
            path = f"../cards/{career}/{_type}"
            for fp in os.listdir(path):
                cards = json.load(open(f"{path}/{fp}", encoding='utf8'))['cards']
                for card in cards:
                    collect_kv(
                        card,
                        card_set,
                        lambda x: x['cardSet'] + str(x['cardSetId']) if x['cardSet'] == "legacy" else x['cardSet'],
                        lambda x: x['cardSetId']
                    )
                    collect_kv(card, card_class, lambda x: x['cardClass'], lambda x: x['classId'])
                    collect_kv(card, card_rarity, lambda x: x['cardRarity'], lambda x: x['rarityId'])
                    collect_kv(card, card_type, lambda x: x['cardType'], lambda x: x['cardTypeId'])
                    collect_kv(card, minion_type, lambda x: x['minionType'], lambda x: x['minionTypeId'])
                    collect_key(card, tmp, lambda x: x['standard'])
    generate_kv_enum(card_set, "CardSet")
    generate_kv_enum(card_class, "CardClass")
    generate_kv_enum(card_rarity, "CardRarity")
    generate_kv_enum(card_type, "CardType")
    generate_kv_enum(minion_type, "MinionType")
    print(tmp)


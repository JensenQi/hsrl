import json
import os

careers = [
    "demonhunter", "hunter", "druid", "shaman", "rogue",
    "mage", "paladin", "priest", "warrior", "warlock", "neutral"
]


def to_camel(raw):
    return "".join(list(map(lambda x: x.capitalize(), raw.split("-"))))


if __name__ == "__main__":
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/demonhunter/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/demonhunter/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/demonhunter/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/hunter/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/hunter/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/hunter/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/druid/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/druid/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/druid/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/shaman/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/shaman/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/shaman/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/rogue/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/rogue/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/rogue/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/mage/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/mage/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/mage/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/paladin/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/paladin/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/paladin/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/priest/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/priest/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/priest/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/warrior/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/warrior/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/warrior/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/warlock/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/warlock/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/warlock/standard', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/neutral/classical', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/neutral/open', exist_ok=True)
    os.makedirs('../../kotlin/tech/cuda/hsrl/common/card/neutral/standard', exist_ok=True)
    fp = open(f"../../kotlin/tech/cuda/hsrl/common/card/Card.kt", "w")
    fp.writelines("""package tech.cuda.hsrl.common.card

import tech.cuda.hsrl.common.enum.*

abstract class Card {
    abstract val id: Int
    abstract val name: String
    abstract val description: String
    abstract var cost: Int?
    abstract var health: Int?
    abstract var attack: Int?
    abstract val minionType: MinionType?
    abstract val type: CardType
    abstract val rarity: CardRarity
    abstract val cardSet: CardSet
    abstract val cardClass: CardClass
    
    abstract val isClassic: Boolean
    abstract val isStandard: Boolean

    abstract val background: String
    abstract val artist: String
    abstract val image: String
}
""")
    fp.close()

    for career in careers:
        for _type in ['open', 'classical', 'standard']:
            path = f"../cards/{career}/{_type}"
            for fp in os.listdir(path):
                for card in json.load(open(f"{path}/{fp}", encoding='utf8'))['cards']:
                    class_name = "".join(list(map(lambda x: x.capitalize(), card['code'].split("-")[1:]))) + "_" + str(
                        card['cardId'])
                    fp = open(f"../../kotlin/tech/cuda/hsrl/common/card/{career}/{_type}/{class_name}.kt", "w")
                    fp.writelines(f"""package tech.cuda.hsrl.common.card.{career}.{_type}

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class {class_name} : Card() {{
    override val id = {card['id']}
    override val name = "{card['name']}"
    override val description = "{card['description']}"
    override var cost: Int? = {card['cost'] or "null"}
    override var health: Int? = {card['health'] or "null"}
    override var attack: Int? = {card['attack'] or "null"}
    
    override val isClassic = {'true' if card['classicCard'] else 'false'}
    override val isStandard = {'true' if card['standardCard'] else 'false'}

    override val minionType{ " = MinionType." + to_camel(card['minionType']) if card['minionType'] is not None else ": MinionType? = null"}
    override val type = CardType.{to_camel(card['cardType'])}
    override val rarity = CardRarity.{to_camel(card['cardRarity'])}
    override val cardClass = CardClass.{to_camel(card['cardClass'] or career)}
    override val cardSet = CardSet.{to_camel(card['cardSet'] + str(card['cardSetId']) if card['cardSet'] == "legacy" else card['cardSet'])}
    override val background = "{card['background'].replace('"', "'")}"
    override val artist = "{card['artist']}"
    override val image = "{card['image']}"
}}
""")
                    fp.close()

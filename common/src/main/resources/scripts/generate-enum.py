
import json
import os

names = ["demonhunter", "hunter", "druid", "shaman", "rogue",
         "mage", "paladin", "priest", "warrior", "warlock", "neutral"]

total = 0
keywords = {}
for name in names:
    path = f"{name}/standard"
    for fp in os.listdir(path):
        cards = json.load(open(f"{path}/{fp}", encoding='utf8'))['cards']
        for card in cards:
            k = card['cardSet']
            v = card['cardSetId']
            if k in keywords and keywords[k] != v:
                print(keywords, k, v)
                print("error")
            else:
                keywords[k] = v
print("done")
print(keywords)


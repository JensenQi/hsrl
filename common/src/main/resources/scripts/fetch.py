
import requests

types = {
            "druid": 25,
            "hunter": 25,
            "mage": 25,
            "neutral": 157,
            "paladin": 25,
            "priest": 25,
            "rogue": 25,
            "shaman": 25,
            "warlock": 25,
            "warrior": 25
}
for name, count in types.items():
    for page in range(int(count / 8) + 1):
        url = "https://hs.blizzard.cn/action/cards/query"
        data = {
            'cardClass': name,
            'p': page + 1,
            'standard': 2
        }
        resp = requests.post(url, data=data)
        output = open(f"{name}-{page+1}.json", 'w', encoding='utf8')
        output.writelines(resp.content.decode('utf8'))
        print(name, page)

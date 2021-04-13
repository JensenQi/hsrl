package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlightnozzleCrawler_49361 : Card() {
    override val id = 49361
    override val name = "荒疫爬行者"
    override val description = "<b>亡语：</b>召唤一个1/1并具有<b>剧毒</b>和<b>突袭</b>的软泥怪。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“本来都已经控制住它了，你偏要上来凑热闹给它装了腿！”"
    override val artist = "Anton Kagounkin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a919a956ae2e6fe6a34d18667314bbe77092ce096609f1688b8a785e874cbb5.png"
}

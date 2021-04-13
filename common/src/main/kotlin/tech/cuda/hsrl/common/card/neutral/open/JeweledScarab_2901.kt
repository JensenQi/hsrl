package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JeweledScarab_2901 : Card() {
    override val id = 2901
    override val name = "宝石甲虫"
    override val description = "<b>战吼：发现</b>一张 法力值消耗为（3）的卡牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "要真是宝石那该多好啊……"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa27cc3efcba7eea434f0042873f5501dd0203363d56a0dbc8bdeb8acd1fa4ce.png"
}

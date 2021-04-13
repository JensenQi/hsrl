package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BarakKodobane_63461 : Card() {
    override val id = 63461
    override val name = "巴拉克·科多班恩"
    override val description = "<b>战吼：</b> 抽取法力值消耗为（1），（2）和（3）点的法术牌各一张。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "他们都说他是马背上的神射手。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14461ac308169d647f3442b725c51d30e9ad1b69263bbbda9e865a48538905f5.png"
}

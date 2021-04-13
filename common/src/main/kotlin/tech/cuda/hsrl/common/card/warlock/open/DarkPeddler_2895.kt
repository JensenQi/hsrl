package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkPeddler_2895 : Card() {
    override val id = 2895
    override val name = "黑市摊贩"
    override val description = "<b>战吼：发现</b>一张 法力值消耗为（1）的卡牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Loe
    override val background = "快来瞧瞧这台空气净化器，它的功能如此强大，连你的灵魂都能净化！"
    override val artist = "George Davis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe2204c55edf4de7d0b6aa4d89c039029d5a1a3cda61821954b60adc88c204d0.png"
}

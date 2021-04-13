package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlubberBaron_40294 : Card() {
    override val id = 40294
    override val name = "黑金大亨"
    override val description = "每当你召唤一个具有<b>战吼</b>的随从时，便使这张牌（在你手牌中时）获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "不论是石油大亨，铁路大亨还是钢铁大亨，多多少少都与这位黑金大亨有着鲜为人知的联系。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/64c241406e8365e4fcd3c98b3b6013011eeb1f5dd5e0be662974d63fcd5bc449.png"
}

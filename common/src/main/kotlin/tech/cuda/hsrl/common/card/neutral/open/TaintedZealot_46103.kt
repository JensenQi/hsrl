package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TaintedZealot_46103 : Card() {
    override val id = 46103
    override val name = "被污染的狂热者"
    override val description = "<b>圣盾</b> <b>法术伤害+1</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "圣光的爱，被污染了就不会再回来。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18e8ad4264ae423a3ec9ab7acd8214566e0d0a5045ad0f212283dadc0dcf083e.png"
}

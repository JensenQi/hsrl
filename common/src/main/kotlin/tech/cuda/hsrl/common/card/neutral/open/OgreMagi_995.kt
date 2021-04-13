package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OgreMagi_995 : Card() {
    override val id = 995
    override val name = "食人魔法师"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "教授食人魔如何施法是个值得商榷的决定。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a1b5650bf8e302d0cc9991bdb9c70c569180173dc231345514673a4c3a20ff5.png"
}

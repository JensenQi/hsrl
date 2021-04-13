package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OgreMagi_68405 : Card() {
    override val id = 68405
    override val name = "食人魔法师"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "教授食人魔如何施法是个值得商榷的决定。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a9d505473bdbd583c921850bf4d283e0c0c2db077cac2ed4a5461c363976f98.png"
}

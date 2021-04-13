package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PitFighter_2521 : Card() {
    override val id = 2521
    override val name = "格斗士"
    override val description = ""
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "他们的血液里充斥着尚武精神，想要打一架吗？"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ee991dfb6d266313aa7c6f90a3c1922ee409f77ae30d91e6e880cb384060444.png"
}

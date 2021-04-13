package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AssassinsBlade_421 : Card() {
    override val id = 421
    override val name = "刺客之刃"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "只有真正的刺客才配拥有。如假包换。"
    override val artist = "Brian Huang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa50f4fb6dcaafa185f51c65a49e57ddc09086a4ff87dd138c48093598c7a0e1.png"
}

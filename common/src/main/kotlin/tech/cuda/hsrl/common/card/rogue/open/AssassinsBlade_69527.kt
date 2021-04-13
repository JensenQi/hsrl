package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AssassinsBlade_69527 : Card() {
    override val id = 69527
    override val name = "刺客之刃"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "只有真正的刺客才配拥有。如假包换。"
    override val artist = "Brian Huang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d86753f2a4809cf93caab7ab34174448e8cd968571c0346ab52b8dc52a3afa62.png"
}

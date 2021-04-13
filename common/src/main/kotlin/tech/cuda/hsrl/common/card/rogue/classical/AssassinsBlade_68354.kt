package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AssassinsBlade_68354 : Card() {
    override val id = 68354
    override val name = "刺客之刃"
    override val description = ""
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "只有真正的刺客才配拥有。如假包换。"
    override val artist = "Brian Huang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a3b4784f2efb6747453921aaac246ba529db21f8e223f732b17c62b6dfd8fd9.png"
}

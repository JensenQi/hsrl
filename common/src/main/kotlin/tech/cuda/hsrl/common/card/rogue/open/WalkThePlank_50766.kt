package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WalkThePlank_50766 : Card() {
    override val id = 50766
    override val name = "走跳板"
    override val description = "消灭一个未受伤的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "忍一时波涛汹涌，进一步海阔天空。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4432e7a5239d552ad5adaf3419aeef7968e536432c4b87214d8d1658c7122b66.png"
}

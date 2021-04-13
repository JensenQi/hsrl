package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnapFreeze_69699 : Card() {
    override val id = 69699
    override val name = "急速冷冻"
    override val description = "<b>冻结</b>一个随从。如果该随从已被<b>冻结</b>，则将其消灭。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "舔一舔就知道甜不甜了。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f648cd0436df9ababb2a012ed1253c21785db06b2a6c421abac65a5983736b1d.png"
}

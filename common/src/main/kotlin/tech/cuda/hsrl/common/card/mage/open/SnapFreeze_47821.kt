package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnapFreeze_47821 : Card() {
    override val id = 47821
    override val name = "急速冷冻"
    override val description = "<b>冻结</b>一个随从。如果该随从已被<b>冻结</b>，则将其消灭。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "舔一舔就知道甜不甜了。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3851985167d883c174d8f2eb5d36193ce3eed640b8f0141f6c98cb423ecdb390.png"
}

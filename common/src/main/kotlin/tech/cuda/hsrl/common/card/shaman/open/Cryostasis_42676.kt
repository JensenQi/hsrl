package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cryostasis_42676 : Card() {
    override val id = 42676
    override val name = "低温静滞"
    override val description = "使一个随从获得+3/+3，并使其<b>冻结</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "等我们找到解药就来融化你。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c17335f07ac800666fb7451a3ec9508aa24c54b478110594ba44cf6c735c350.png"
}

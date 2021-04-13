package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CircleOfHealing_1362 : Card() {
    override val id = 1362
    override val name = "治疗之环"
    override val description = "为所有随从恢复 4点生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "神圣的象征。"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7180206063719b44173aa616a9e984ff4380f31478efa48d62d15eaf31205308.png"
}

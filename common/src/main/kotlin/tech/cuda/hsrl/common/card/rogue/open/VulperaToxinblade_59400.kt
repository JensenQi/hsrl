package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VulperaToxinblade_59400 : Card() {
    override val id = 59400
    override val name = "狐人淬毒师"
    override val description = "你的武器获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "武器本身已经很好用了……这只是以防万一。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1c12daefeb7141e593a85a315f166f372fd183b9a053e907f923e709bb7f628.png"
}

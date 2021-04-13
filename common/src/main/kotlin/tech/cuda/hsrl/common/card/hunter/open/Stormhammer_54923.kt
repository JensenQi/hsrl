package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stormhammer_54923 : Card() {
    override val id = 54923
    override val name = "风暴之锤"
    override val description = "当你控制着一条龙时，不会失去 耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "风暴之锤是老大，毁灭之锤是渣渣。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/916e32882a0d03d66c97cd47ef77d847aef618a430742d2bd97018e6ad72a53c.png"
}

package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiegeEngine_2054 : Card() {
    override val id = 2054
    override val name = "重型攻城战车"
    override val description = "每当你获得护甲，该随从便获得 +1攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "冬拥堡垒的城墙一般都会用最坚固的材料在两个半小时内修筑起来。但这并不能阻止攻城战车的长驱直入。"
    override val artist = "Zero"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2bbf9701e79c4317e31bd88db82386d1756f655a782194f8ebca18e961dba43c.png"
}

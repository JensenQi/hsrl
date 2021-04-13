package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WaterElemental_69503 : Card() {
    override val id = 69503
    override val name = "水元素"
    override val description = "<b>冻结</b>任何受到该随从伤害的角色。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "千万别在晚会上召唤水元素。它会把一切都搞砸的。"
    override val artist = "John Avon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e8c35d30931ae2a5f4c9bbe0865a5f679c6c6c9f51e2a247378668c5640de4e9.png"
}

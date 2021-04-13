package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WaterElemental_68328 : Card() {
    override val id = 68328
    override val name = "水元素"
    override val description = "<b>冻结</b>任何受到该随从伤害的角色。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "千万别在晚会上召唤水元素。它会把一切都搞砸的。"
    override val artist = "John Avon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eaf44cd263545a397f3f839fc5df662c4d104305af9efbdff35365d759b96731.png"
}

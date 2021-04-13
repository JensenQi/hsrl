package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LivingDragonbreath_55418 : Card() {
    override val id = 55418
    override val name = "活化龙息"
    override val description = "你的随从无法被 <b>冻结</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "如果你想要这种好身材，那你就得让脂肪燃起来。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3fa65d96d4718a0bbe574b7e3a178bf7945cc47989569fb19c3a2fdcdb80f82d.png"
}

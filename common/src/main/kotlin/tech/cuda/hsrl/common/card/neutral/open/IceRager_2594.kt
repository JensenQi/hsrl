package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceRager_2594 : Card() {
    override val id = 2594
    override val name = "冰霜暴怒者"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "再怎么说他也要比岩浆暴怒者冷静多了。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbbf50b41b6fddba10ea9d37071b2c2f5a90bbd272a5ec20762e90f6c4d74115.png"
}

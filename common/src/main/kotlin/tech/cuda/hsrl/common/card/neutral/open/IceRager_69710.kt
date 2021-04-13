package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceRager_69710 : Card() {
    override val id = 69710
    override val name = "冰霜暴怒者"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "再怎么说他也要比岩浆暴怒者冷静多了。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69f2bbf4decba333740fdafe6e70b276ba7ee93a46393fb024063d67f9a1837e.png"
}

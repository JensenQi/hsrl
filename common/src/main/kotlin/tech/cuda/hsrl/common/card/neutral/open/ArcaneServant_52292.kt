package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneServant_52292 : Card() {
    override val id = 52292
    override val name = "奥术仆从"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“先生，需要我提供殴打服务吗？”"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/138d4b26d411b329808cca14be727a80b183e1d42b4440cdbd735a7de0b271a7.png"
}

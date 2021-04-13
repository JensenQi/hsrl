package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Candletaker_53402 : Card() {
    override val id = 53402
    override val name = "夺烛木乃伊"
    override val description = "<b>复生</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“你不该唤——醒——蜡——烛！”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b0ca893fd5efddd36ddbf507657d579b319d111ead4a1a77994598d858b5edb.png"
}

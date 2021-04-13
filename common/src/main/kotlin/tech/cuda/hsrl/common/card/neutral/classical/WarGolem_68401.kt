package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarGolem_68401 : Card() {
    override val id = 68401
    override val name = "作战傀儡"
    override val description = ""
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "傀儡们从来不会胆怯，但是出于某种原因，当你对它们施放“恐惧”的时候，它们依然会逃跑。也许这就是天性？或是想要融入这个世界的渴望？"
    override val artist = "Dave Kendall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfa35e5cfb12d8db5b40dcd120f7a3dfeb040b52544627d4d707e8f8ad26b115.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarGolem_712 : Card() {
    override val id = 712
    override val name = "作战傀儡"
    override val description = ""
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "傀儡们从来不会胆怯，但是出于某种原因，当你对它们施放“恐惧”的时候，它们依然会逃跑。也许这就是天性？或是想要融入这个世界的渴望？"
    override val artist = "Dave Kendall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7a43482a702c843bb7b324ef936e1c7b521f457b9b655ac48df2e41acaebad1.png"
}

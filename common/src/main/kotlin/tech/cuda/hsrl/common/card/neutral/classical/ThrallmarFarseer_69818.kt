package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThrallmarFarseer_69818 : Card() {
    override val id = 69818
    override val name = "萨尔玛先知"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他受命驻扎在地狱火半岛，但他很希望能够被调配到奥格瑞玛附近，或者随便什么地方，只要那里的土地不要老是着火就行。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/909f970d4464b5ffdf01182b322171c7248df353df06e6bb9078cabdc38e5997.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThrallmarFarseer_765 : Card() {
    override val id = 765
    override val name = "萨尔玛先知"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他受命驻扎在地狱火半岛，但他很希望能够被调配到奥格瑞玛附近，或者随便什么地方，只要那里的土地不要老是着火就行。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7c3bf7cd6e7d6bcbbb69debc81151e9d7865875aae0d943c3b2dadb6d71f473.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlightMaster_52940 : Card() {
    override val id = 52940
    override val name = "飞行管理员"
    override val description = "<b>战吼：</b>为每个玩家召唤一只2/2的狮鹫。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "狮鹫将在安全演示之后起飞。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4513f5b1d2ca8bff9ec295e28fd1af314ad754ad14b5ac58fe99921823759b58.png"
}

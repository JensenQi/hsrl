package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BarrensStablehand_69671 : Card() {
    override val id = 69671
    override val name = "贫瘠之地饲养员"
    override val description = "<b>战吼：</b>随机召唤一只野兽。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "就不出霍弗。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a08b3c11d9acbee688edf3af650b5f6032e783f661f1ae3d40abe0b266b8da9c.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BarrensStablehand_54838 : Card() {
    override val id = 54838
    override val name = "贫瘠之地饲养员"
    override val description = "<b>战吼：</b>随机召唤一只野兽。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "就不出霍弗。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a9ff38f6818f78bdfbf496907e427ff52a40d9dc26d8c8c0a2c0ba056d4f4980.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KronxDragonhoof_55907 : Card() {
    override val id = 55907
    override val name = "克罗斯·龙蹄"
    override val description = "<b>战吼：</b>抽取迦拉克隆。如果你已经变为迦拉克隆，则释放一场 灾难。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "只有他能把迦拉克隆的咖啡安排得明明白白。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84be661a55a75ec4ec40e5d1e93879933306be21c85fea2278c25d72613e07cd.png"
}

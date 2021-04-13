package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Scalerider_55431 : Card() {
    override val id = 55431
    override val name = "锐鳞骑士"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "骑着龙，齐动枪，骑着龙动枪！"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51dce04b2307b9d3c5946bcdca7c7df1ef148cac5093619423aca11bff934b0a.png"
}

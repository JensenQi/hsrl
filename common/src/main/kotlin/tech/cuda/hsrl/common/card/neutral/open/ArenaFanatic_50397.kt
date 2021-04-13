package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArenaFanatic_50397 : Card() {
    override val id = 50397
    override val name = "赛场狂热者"
    override val description = "<b>战吼：</b>使你手牌中的所有随从牌获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你能从她身上找到所有战队的元素吗？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/62569818831ee48624ae36da1700aebc68cb5cd7df69651dd84d3e9ce4914934.png"
}

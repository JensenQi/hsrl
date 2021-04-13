package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdlightOracle_1016 : Card() {
    override val id = 1016
    override val name = "寒光智者"
    override val description = "<b>战吼：</b>每个玩家抽两张牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "他们能够预见未来。在未来的时间里，双方玩家都将抽更多的牌。真准！"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/757a24ff69b512f9a8b7a0672251fd72a3ebf470e6224604d7252e8732ccf429.png"
}

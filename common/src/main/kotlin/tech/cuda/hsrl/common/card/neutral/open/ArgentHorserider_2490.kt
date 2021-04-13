package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentHorserider_2490 : Card() {
    override val id = 2490
    override val name = "银色骑手"
    override val description = "<b>冲锋</b> <b>圣盾</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "身为骑手，没有一匹好马怎么能行？"
    override val artist = "Evgeniy Zaqumyennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/776834f51f6309e312b71b6bbdc967b00be2b3dfe5f18b5d84ecd700b0f89b6e.png"
}

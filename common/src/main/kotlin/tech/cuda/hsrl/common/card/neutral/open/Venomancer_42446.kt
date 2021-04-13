package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Venomancer_42446 : Card() {
    override val id = 42446
    override val name = "制毒师"
    override val description = "<b>剧毒</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "要不是身患绝症想为家里留笔钱，她也不会走上这条路。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e6e7529e9e9374c6be52a6447225463f76afd9ca37019569ee1db872e657ead.png"
}

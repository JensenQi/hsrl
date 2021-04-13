package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GurubashiOffering_50396 : Card() {
    override val id = 50396
    override val name = "古拉巴什供品"
    override val description = "在你的回合开始时，消灭该随从，并获得 8点护甲值。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "供品限时特惠，一次献祭，双倍祝福（受益人仅限祭品本人）！"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2a1d940056ed9e5f80202ba03ba0dfef640b19eb9f641b42499cebbb6f81ce2.png"
}

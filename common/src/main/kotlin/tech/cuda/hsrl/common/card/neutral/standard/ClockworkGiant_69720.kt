package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClockworkGiant_69720 : Card() {
    override val id = 69720
    override val name = "发条巨人"
    override val description = "你的对手每有一张手牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 12
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "虽然体型相仿，他和山岭巨人总是交不上朋友。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56dbef6d70aae57c8f3d786250ddec08aef5ad0fad13a2002bab66c6784ff282.png"
}

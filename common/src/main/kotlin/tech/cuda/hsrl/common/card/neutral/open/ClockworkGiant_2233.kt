package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClockworkGiant_2233 : Card() {
    override val id = 2233
    override val name = "发条巨人"
    override val description = "你的对手每有一张手牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 12
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "虽然体型相仿，他和山岭巨人总是交不上朋友。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00d26f5a16cfbcd4c920ee51714d3118137cb67886be37f405aecb434cf74a9b.png"
}

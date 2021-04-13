package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shieldbearer_866 : Card() {
    override val id = 866
    override val name = "持盾卫士"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "你知道这个游戏里的盾牌都有多大吗？那可绝对不是轻松的差事。"
    override val artist = "Carl Critchlow"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4c2e9df10aadc1e0e9003c649cc6bc1a776d907ba59b867a8cd723fbe732ae73.png"
}

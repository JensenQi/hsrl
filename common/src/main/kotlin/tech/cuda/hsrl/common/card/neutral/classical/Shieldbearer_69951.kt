package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shieldbearer_69951 : Card() {
    override val id = 69951
    override val name = "持盾卫士"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "你知道这个游戏里的盾牌都有多大吗？那可绝对不是轻松的差事。"
    override val artist = "Carl Critchlow"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bca65672f63bbbc987bed8cb3e2ecc19ddffb002014460664df51c935c6f3674.png"
}

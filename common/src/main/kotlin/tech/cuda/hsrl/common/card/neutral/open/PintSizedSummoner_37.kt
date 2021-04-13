package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PintSizedSummoner_37 : Card() {
    override val id = 37
    override val name = "小个子召唤师"
    override val description = "你每个回合使用的第一张随从牌的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "大个子召唤师就是由她召唤出来的。"
    override val artist = "Ron Spears"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e341f7ac30c5094653a035b58b04ba4ca96eff7378ce6d25c50dc516122edfc6.png"
}

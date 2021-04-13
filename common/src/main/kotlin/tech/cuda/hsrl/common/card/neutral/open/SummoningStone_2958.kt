package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SummoningStone_2958 : Card() {
    override val id = 2958
    override val name = "集合石"
    override val description = "每当你施放一个法术，随机召唤一个法力值消耗相同的随从。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "根据统计数据表明，等待被召唤的总是那些个懒人。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c15b9280b858c40e42c900842d5a93db50e12f629af212356ed7754eab2ba897.png"
}

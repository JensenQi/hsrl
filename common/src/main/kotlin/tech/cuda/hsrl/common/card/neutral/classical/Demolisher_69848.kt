package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demolisher_69848 : Card() {
    override val id = 69848
    override val name = "攻城车"
    override val description = "在你的回合开始时，随机对一个敌人造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "攻城这件事一点儿也不好玩，而且通常还不怎么奏效，因为现在人人都有飞行坐骑。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7123aa920eb1fadb30c3ad2aaab8746d81f3670d8aef6fc8a9e68f77d59e17e1.png"
}

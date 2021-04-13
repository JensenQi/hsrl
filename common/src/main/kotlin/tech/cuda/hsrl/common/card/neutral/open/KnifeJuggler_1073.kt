package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KnifeJuggler_1073 : Card() {
    override val id = 1073
    override val name = "飞刀杂耍者"
    override val description = "在你召唤一个随从后，随机对一个敌人造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "更具野心的飞刀杂耍者会晋升为“炸弹杂耍者”。只是现在还没有谁能够坚持到被做成卡牌。"
    override val artist = "Matt Cavotta"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8bec3580f03f21dd4e0ded210eb2702602656dbc67b2882334647154972eb71b.png"
}

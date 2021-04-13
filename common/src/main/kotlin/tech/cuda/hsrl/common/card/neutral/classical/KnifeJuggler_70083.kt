package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KnifeJuggler_70083 : Card() {
    override val id = 70083
    override val name = "飞刀杂耍者"
    override val description = "在你召唤一个随从后，随机对一个敌人造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "更具野心的飞刀杂耍者会晋升为“炸弹杂耍者”。只是现在还没有谁能够坚持到被做成卡牌。"
    override val artist = "Matt Cavotta"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe70a84e3f5ef471c5cadd7ffe5c1f16c4a50f871f89b690d7b7779b980e72fb.png"
}

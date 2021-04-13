package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WildPyromancer_70084 : Card() {
    override val id = 70084
    override val name = "狂野炎术师"
    override val description = "在你施放一个法术后，对所有随从造成1点伤害。"
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
    override val background = "爆炸吧，宝贝儿！炸得越烂越好！让那些统治者去死吧！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/31e17819280c94ac0950b6761dc4059db50a44f3282dca024b718f1961502dfa.png"
}

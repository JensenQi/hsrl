package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoltenGiant_70058 : Card() {
    override val id = 70058
    override val name = "熔核巨人"
    override val description = "你的英雄每受到1点伤害，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 20
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "无数初次来到熔火之心的冒险者倒在他滚烫的脚掌之下。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc4ca4bc1a39c0d94c0225567aca26c88d8912d6aba8ffeb030c5ed67d691410.png"
}

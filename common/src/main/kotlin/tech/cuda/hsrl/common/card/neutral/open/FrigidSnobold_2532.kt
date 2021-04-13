package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrigidSnobold_2532 : Card() {
    override val id = 2532
    override val name = "雪地狗头人"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "讽刺的是，雪地是蜡烛最大的天敌。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c45e2bec60066b1b3df6d110a98bfda10fe4a8a83f58918bb7e58fe548c1872.png"
}

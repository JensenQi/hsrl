package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NerubianEgg_1786 : Card() {
    override val id = 1786
    override val name = "蛛魔之卵"
    override val description = "<b>亡语：</b>召唤一个4/4的蛛魔。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "蛛魔产的卵和鸡生的蛋都含有丰富的蛋白质。"
    override val artist = "Justin Thavirat"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc5bb9846d0df6c9ef63ffd13046d7af8df8327c1bd9137e89e92ed78bb8e1f0.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NerubianEgg_69713 : Card() {
    override val id = 69713
    override val name = "蛛魔之卵"
    override val description = "<b>亡语：</b>召唤一个4/4的蛛魔。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "蛛魔产的卵和鸡生的蛋都含有丰富的蛋白质。"
    override val artist = "Justin Thavirat"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe399650969d8b68e216dc2300e4e83a7aa932bc3df4717a349b558dfbfffada.png"
}

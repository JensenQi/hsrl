package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DevilsaurEgg_41259 : Card() {
    override val id = 41259
    override val name = "魔暴龙蛋"
    override val description = "<b>亡语：</b>召唤一个5/5的魔暴龙。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "漏斗蛋糕如此美味的秘诀，就是用魔暴龙蛋来和面。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbdc743e4cb4695ae97cafdd82b50c46d085d1f53050086ade0edb13a5ea4284.png"
}

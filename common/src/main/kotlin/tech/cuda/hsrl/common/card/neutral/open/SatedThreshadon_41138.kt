package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SatedThreshadon_41138 : Card() {
    override val id = 41138
    override val name = "臃肿的蛇颈龙"
    override val description = "<b>亡语：</b>召唤三个1/1的鱼人。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "昨晚的鱼人刺身实在是太美味了！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d33cd5ad2c0ef1478817187788664bd4a8da7254f7fa755b293490e1b600edc6.png"
}

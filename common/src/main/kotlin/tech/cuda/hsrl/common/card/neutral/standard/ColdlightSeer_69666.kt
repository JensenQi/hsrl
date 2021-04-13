package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdlightSeer_69666 : Card() {
    override val id = 69666
    override val name = "寒光先知"
    override val description = "<b>战吼：</b>使你的其他鱼人获得+2生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "寒光鱼人终年居住于无底海源最黑暗的洞穴之中。所以，是的，你到哪儿都别想摆脱鱼人。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca0ed580605d44d4c06429a5a49f7005f7ef0b1f17274f6101d7ca8ab27e67c8.png"
}

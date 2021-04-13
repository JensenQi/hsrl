package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdlightSeer_69849 : Card() {
    override val id = 69849
    override val name = "寒光先知"
    override val description = "<b>战吼：</b>使所有其他鱼人获得+2生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "寒光鱼人终年居住于无底海源最黑暗的洞穴之中。所以，是的，你到哪儿都别想摆脱鱼人。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/11b575081b56d51ef044c9613ea7edb745c7ce65af19734b3ba61a600addb628.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdlightSeer_453 : Card() {
    override val id = 453
    override val name = "寒光先知"
    override val description = "<b>战吼：</b>使你的其他鱼人获得+2生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "寒光鱼人终年居住于无底海源最黑暗的洞穴之中。所以，是的，你到哪儿都别想摆脱鱼人。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7785aeb68ce83204be8aea7e663d5c56015461aeb4ce87e3841a4c54c400294d.png"
}

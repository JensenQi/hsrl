package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaReservoir_52942 : Card() {
    override val id = 52942
    override val name = "法力之池"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 2
    override var health: Int? = 6
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "再泡一会儿，可就成落水狗了。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee9360714a211c0da3236099e0999f61dea9fa1e8f580fd5c87165589818b359.png"
}

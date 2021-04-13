package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentCommander_281 : Card() {
    override val id = 281
    override val name = "银色指挥官"
    override val description = "<b>冲锋</b> <b>圣盾</b>"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "银色指挥官总是机警地注意着天灾军团的动向，同时阻止任何想在咖啡店里插队买咖啡的人。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ee9615c57f677ffdec1b2eecaac28b207af439d6bbff2162cbe63869bcb96e1.png"
}

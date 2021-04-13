package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentCommander_69835 : Card() {
    override val id = 69835
    override val name = "银色指挥官"
    override val description = "<b>冲锋</b> <b>圣盾</b>"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "银色指挥官总是机警地注意着天灾军团的动向，同时阻止任何想在咖啡店里插队买咖啡的人。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4964b3e436e7038235fec7a112e0c3c00eb5ef91706ffc3e95200050662a7859.png"
}

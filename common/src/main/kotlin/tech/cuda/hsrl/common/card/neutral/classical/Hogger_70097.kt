package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hogger_70097 : Card() {
    override val id = 70097
    override val name = "霍格"
    override val description = "在你的回合结束时，召唤一个2/2并具有<b>嘲讽</b>的豺狼人。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "霍格可是超级厉害的。如果你杀了他，只是因为他让你这么做的。"
    override val artist = "Laurel Austin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eeca89169aaf1d530b575afdfb9e6a711ec1388fa5ab34d34857221e9c91d1d9.png"
}

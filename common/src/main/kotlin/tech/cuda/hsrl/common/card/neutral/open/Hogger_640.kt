package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hogger_640 : Card() {
    override val id = 640
    override val name = "霍格"
    override val description = "在你的回合结束时，召唤一个2/2并具有<b>嘲讽</b>的豺狼人。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "霍格可是超级厉害的。如果你杀了他，只是因为他让你这么做的。"
    override val artist = "Laurel Austin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0eec52175bf7e367d4843601e6119c45d6abb95406ad37f3e06a5a35c6704d52.png"
}

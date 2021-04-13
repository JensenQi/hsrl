package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnpoweredMauler_48060 : Card() {
    override val id = 48060
    override val name = "没电的铁皮人"
    override val description = "在本回合中，除非你施放过法术，否则无法进行攻击。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "经过了一天的辛苦劳作，它想逛大卖场放松一下。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0669f02a89e7f77ef25f6eaed68f2d240e28f6715e4e53b94394e64be12086f1.png"
}

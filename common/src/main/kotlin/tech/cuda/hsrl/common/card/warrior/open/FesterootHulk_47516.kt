package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FesterootHulk_47516 : Card() {
    override val id = 47516
    override val name = "腐树巨人"
    override val description = "在一个友方随从攻击后，获得+1攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "虽说它外强中干，但还是很危险的。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d7358339e263abd434b01c465db0f16cc992f31abec479c520e75f092f8d437.png"
}

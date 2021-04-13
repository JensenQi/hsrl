package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Armorsmith_69950 : Card() {
    override val id = 69950
    override val name = "铸甲师"
    override val description = "每当一个友方随从受到伤害，便获得1点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "她接受公会修理资金！"
    override val artist = "Greg Hildebrandt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60be9526eb9ec6269a7d98cd60ac75c0887e02ef3855ffa22424ca26b0e824a9.png"
}

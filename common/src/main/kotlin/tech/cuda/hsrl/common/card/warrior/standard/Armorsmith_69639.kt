package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Armorsmith_69639 : Card() {
    override val id = 69639
    override val name = "铸甲师"
    override val description = "每当一个友方随从受到伤害，便获得1点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "她接受公会修理资金！"
    override val artist = "Greg Hildebrandt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c50c7d8d2bbf33aed76622039d1de9effe7d0fab267a33b71ee1c4d9996cf9a.png"
}

package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Armorsmith_596 : Card() {
    override val id = 596
    override val name = "铸甲师"
    override val description = "每当一个友方随从受到伤害，便获得1点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "她接受公会修理资金！"
    override val artist = "Greg Hildebrandt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/851580ca850d5b9511d13b9c6c5e857494ff7df14fdc2eadc11552e26a8f68f7.png"
}

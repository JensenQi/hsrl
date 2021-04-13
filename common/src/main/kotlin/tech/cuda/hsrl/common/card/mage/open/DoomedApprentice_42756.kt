package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DoomedApprentice_42756 : Card() {
    override val id = 42756
    override val name = "末日学徒"
    override val description = "你对手法术的法力值消耗增加（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "吉安娜在学徒保护方面一直备受争议。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1c060a8c1656517d52abfa81facdd92288a673723ac7bba07ce650feff43221.png"
}

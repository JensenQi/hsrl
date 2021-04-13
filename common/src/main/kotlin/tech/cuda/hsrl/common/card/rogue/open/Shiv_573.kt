package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shiv_573 : Card() {
    override val id = 573
    override val name = "毒刃"
    override val description = "造成 1点伤害，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "毒如鹤顶，刃若清刚；图穷匕现，君命难长。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f321be5c41464134f531f7f1503f0e38c7b494400e5a82a1786dea6a0a557904.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Polymorph_77 : Card() {
    override val id = 77
    override val name = "变形术"
    override val description = "使一个随从变形成为1/1的绵羊。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "你能想象一个嗜血的兽人发出咩咩的叫声吗？"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db28a4e1f92d03f3cb0bafe20f95c0c768b4e04a4134fa7c77d07dc5741e87c7.png"
}

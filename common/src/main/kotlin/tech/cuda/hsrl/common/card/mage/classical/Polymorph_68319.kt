package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Polymorph_68319 : Card() {
    override val id = 68319
    override val name = "变形术"
    override val description = "使一个随从变形成为1/1的绵羊。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "你能想象一个嗜血的兽人发出咩咩的叫声吗？"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d6b28ef2946bf1369933678f6cb26e022ac92a78bd15d4de7a407dee9249886.png"
}

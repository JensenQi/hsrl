package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomerang_42801 : Card() {
    override val id = 42801
    override val name = "末日回旋镖"
    override val description = "对一个随从投掷你的武器，对该随从造成等同于该武器攻击力的伤害，随后该武器返回你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "保证武器可直接回到你的手上！（注意佩戴手套，要加厚的。）"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7abe9c75517651ffda9535de6628bf8ed34ce37837997678b4c3dd07eab314b.png"
}

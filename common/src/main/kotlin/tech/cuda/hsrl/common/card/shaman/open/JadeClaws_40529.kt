package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeClaws_40529 : Card() {
    override val id = 40529
    override val name = "青玉之爪"
    override val description = "<b>战吼：</b>召唤一个 的<b>青玉魔像</b>。 <b>过载：</b>（1）"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "“造价昂贵，只配强者拥有！”——艾雅·黑掌"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db1a72cb00437cfa70ab31367f391fc649558786bc7bb977f784a98b9b82ffb1.png"
}

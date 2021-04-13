package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConeOfCold_69904 : Card() {
    override val id = 69904
    override val name = "冰锥术"
    override val description = "<b>冻结</b>一个随从和其相邻的随从，并对它们造成 1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "冰锥术在大约90年前开始流行起来，而在那之前，肯瑞托的法师们习惯用的是冰块术。"
    override val artist = "Leo Che"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ac37e3a8aec093961e4f8a98fa487b9daf8507f8774387c03854517939608ab.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConeOfCold_69606 : Card() {
    override val id = 69606
    override val name = "冰锥术"
    override val description = "<b>冻结</b>一个随从和其相邻的随从，并对它们造成 1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "冰锥术在大约90年前开始流行起来，而在那之前，肯瑞托的法师们习惯用的是冰块术。"
    override val artist = "Leo Che"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69f6184385ab364a60f06935a1eb5c40d301fd670599345e324119b15328a96c.png"
}

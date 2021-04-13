package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneIntellect_555 : Card() {
    override val id = 555
    override val name = "奥术智慧"
    override val description = "抽两张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "使用这张牌能让你变得更聪明。面对现实吧：变聪明些对我们大家来说都是好事。"
    override val artist = "Dave Berggren"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12cbc8fd72177489bd10933c0d70eadcf4023c18009c6d4627eb3a3fa2e6aa5e.png"
}

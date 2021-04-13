package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneIntellect_69500 : Card() {
    override val id = 69500
    override val name = "奥术智慧"
    override val description = "抽两张牌。"
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
    override val background = "使用这张牌能让你变得更聪明。面对现实吧：变聪明些对我们大家来说都是好事。"
    override val artist = "Dave Berggren"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c0b08eb273c426f67f9e67077f995f203cc5ced8bcb129f69534cd3e0cc92c1.png"
}

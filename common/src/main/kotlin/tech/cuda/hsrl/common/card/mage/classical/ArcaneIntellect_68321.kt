package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneIntellect_68321 : Card() {
    override val id = 68321
    override val name = "奥术智慧"
    override val description = "抽两张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "使用这张牌能让你变得更聪明。面对现实吧：变聪明些对我们大家来说都是好事。"
    override val artist = "Dave Berggren"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ebbbea0c7b1dfc54ef56877f3cf2cae172752d80b7dbb574579c222d452ba9e0.png"
}

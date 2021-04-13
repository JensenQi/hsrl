package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneLuminary_63060 : Card() {
    override val id = 63060
    override val name = "奥术发光体"
    override val description = "你的套牌之外的牌法力值消耗减少（2）点，但不能少于 （1）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "他们说，对战过程中找到的卡牌才是最有价值的。"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6737c5b85a2356b7f904ab1b73ba3a50e006fbf648777a8b66e0736ed63c9bd1.png"
}

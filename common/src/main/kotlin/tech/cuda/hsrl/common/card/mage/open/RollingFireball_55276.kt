package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RollingFireball_55276 : Card() {
    override val id = 55276
    override val name = "火球滚滚"
    override val description = "对一个随从造成 8点伤害，超过其生命值的伤害将由左侧或右侧的随从承担。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "他们为什么不往前后跑呢？"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6264fac99995fa9e1722ce610c6f076bfb6253bff1d2862b9878fbe0690d84f0.png"
}

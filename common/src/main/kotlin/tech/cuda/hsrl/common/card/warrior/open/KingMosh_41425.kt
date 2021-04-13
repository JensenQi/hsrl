package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingMosh_41425 : Card() {
    override val id = 41425
    override val name = "暴龙之王摩什"
    override val description = "<b>战吼：</b>消灭所有受伤的随从。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "摩什觉得没有什么问题是踩一脚不能解决的。如果有，踩两脚。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e47f54fae4f96770dcb140953efa40972c459af1fb5f15eeb1e443f0a752623.png"
}

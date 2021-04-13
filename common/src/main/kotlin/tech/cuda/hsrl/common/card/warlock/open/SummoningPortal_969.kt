package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SummoningPortal_969 : Card() {
    override val id = 969
    override val name = "召唤传送门"
    override val description = "你的随从牌的法力值消耗减少（2）点，但不能少于（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "不能少于1点！你在想什么坏主意呢！"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f1b41f72fcb7bd202f8f8fd9778a74542654a24b79ccfdd70b38f5391a62212.png"
}

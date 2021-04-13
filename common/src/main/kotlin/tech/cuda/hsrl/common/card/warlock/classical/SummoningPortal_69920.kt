package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SummoningPortal_69920 : Card() {
    override val id = 69920
    override val name = "召唤传送门"
    override val description = "你的随从牌的法力值消耗减少（2）点，但不能少于（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "不能少于1点！你在想什么坏主意呢！"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5fe03a55e96bbf836f647db20e959d0251c5477d5e57419ecf0b17a4435898fc.png"
}

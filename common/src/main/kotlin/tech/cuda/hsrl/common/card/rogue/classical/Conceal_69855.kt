package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Conceal_69855 : Card() {
    override val id = 69855
    override val name = "隐藏"
    override val description = "直到你的下个回合，使所有友方随从获得<b>潜行</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "潜行者们能够隐藏除了他们表情之外的一切东西。你不能阻止他们表达执行暗杀后的兴奋感觉。"
    override val artist = "Steve Hui"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d0b5f883e25e466ede595f35f1814f772cb776b6e0279c0ff7590cc18bde9660.png"
}

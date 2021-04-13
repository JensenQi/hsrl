package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Conceal_990 : Card() {
    override val id = 990
    override val name = "隐藏"
    override val description = "直到你的下个回合，使所有友方随从获得<b>潜行</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy4
    override val background = "潜行者们能够隐藏除了他们表情之外的一切东西。你不能阻止他们表达执行暗杀后的兴奋感觉。"
    override val artist = "Steve Hui"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d404d6092b1cce44028d22fe8669692552f030de16d4f223a9d32ae0a5c07ea2.png"
}

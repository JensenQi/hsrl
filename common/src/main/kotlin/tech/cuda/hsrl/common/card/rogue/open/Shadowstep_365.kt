package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowstep_365 : Card() {
    override val id = 365
    override val name = "暗影步"
    override val description = "将一个友方随从移回你的手牌，它的法力值消耗减少 （2）点。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "潜行者的攻击有如舞蹈，有时他们会以暗影步结束这一切。这不是什么终结技，只因为观众喜欢这样子。"
    override val artist = "Graven Tung"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2c081a5e87792c4b1bc68849276c624ced0cd6ab3fa4386ab572dec6103210d.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ResearchProject_48692 : Card() {
    override val id = 48692
    override val name = "研发计划"
    override val description = "每个玩家抽两张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "摘要：本文重点分析了寒光智者在新时代新环境下对牌库数据体系构造的影响及实际应用。 结论：抽两张牌。"
    override val artist = "J. Paick & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/16901bf2b450b215dcf3914095190e7b945efbe958d6bdf909ee25d19d199454.png"
}

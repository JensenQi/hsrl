package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WildGrowth_69513 : Card() {
    override val id = 69513
    override val name = "野性成长"
    override val description = "获得一个空的法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "使用法力水晶增长装置增加你的法力值，只要399！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/081f54846912e291f8b3cb208e7ed4ee06892b99dfd12389e0242b224f91b90b.png"
}

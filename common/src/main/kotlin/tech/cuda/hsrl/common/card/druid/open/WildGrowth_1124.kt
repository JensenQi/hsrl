package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WildGrowth_1124 : Card() {
    override val id = 1124
    override val name = "野性成长"
    override val description = "获得一个空的法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "使用法力水晶增长装置增加你的法力值，只要399！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d88e65b6d10332a3f624adc733e31e3e90a2e02a2d9e6af8125a538426783fb5.png"
}

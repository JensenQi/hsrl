package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WildGrowth_68316 : Card() {
    override val id = 68316
    override val name = "野性成长"
    override val description = "获得一个空的法力水晶。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "使用法力水晶增长装置增加你的法力值，只要399！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80e8c16b1c7e135755d885a33af05e35994aa61f5adc9484b21a0ebc909b3f22.png"
}

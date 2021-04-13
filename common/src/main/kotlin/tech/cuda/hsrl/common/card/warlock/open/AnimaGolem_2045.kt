package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimaGolem_2045 : Card() {
    override val id = 2045
    override val name = "心能魔像"
    override val description = "在每个回合结束时，如果该随从是你唯一的随从，则消灭 该随从。"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "黑暗意志是一个又邪恶又神秘又巨大又不懂得怎么写程序的大坏蛋。"
    override val artist = "Josh Harris"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3312720fb1ac4220a025c828acfe7612532183f98ff705cf44909c1cca6271a7.png"
}

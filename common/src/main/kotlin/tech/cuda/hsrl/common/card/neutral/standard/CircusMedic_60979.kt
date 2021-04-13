package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CircusMedic_60979 : Card() {
    override val id = 60979
    override val name = "马戏团医师"
    override val description = "<b>战吼：</b>恢复 4点生命值。<b>腐蚀：</b>改为造成4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "注意不要接触奇怪的眼球和触手，别也别沾上什么黑暗低语。等到明天早上，你就好了。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b77bc3381f7bd7004ee3934b8f0b89d0f332f2e4387927f1ff54c27e522dd13d.png"
}

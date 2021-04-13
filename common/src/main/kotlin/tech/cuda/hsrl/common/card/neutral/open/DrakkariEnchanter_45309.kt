package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrakkariEnchanter_45309 : Card() {
    override val id = 45309
    override val name = "达卡莱附魔师"
    override val description = "你的回合结束效果会生效两次。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "达卡莱附魔师有个很让人讨厌的习惯，就是每句话结束都要重复好几遍…好几遍…几遍…遍。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43247d6f9a8971b158850d8add9aa745086e6ba50e14d4331c432613c4e6bd10.png"
}

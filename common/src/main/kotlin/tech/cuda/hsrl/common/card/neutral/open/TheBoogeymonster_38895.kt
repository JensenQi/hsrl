package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBoogeymonster_38895 : Card() {
    override val id = 38895
    override val name = "波戈蒙斯塔"
    override val description = "每当波戈蒙斯塔攻击并消灭一个随从，便获得+2/+2。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "波戈蒙斯塔已连续7年蝉联“艾泽拉斯大胃王”的称号，至今为止还没有人能挑战他的记录。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa71e4358de38b36a3648bf7f16cccbeb5c400c7e30d0114e2df4bf29d110df7.png"
}

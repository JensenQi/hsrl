package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkydivingInstructor_56116 : Card() {
    override val id = 56116
    override val name = "伞降教官"
    override val description = "<b>战吼：</b>从你的牌库中召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "“跳伞会有危险吗？”“危险？绝对没有！至少我没有。快跳吧！”"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec15cdc6870480f0036ce82660a32731d7ba6282927465b35d8ebb3db7d44b61.png"
}

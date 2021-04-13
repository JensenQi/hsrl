package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Galvanizer_48983 : Card() {
    override val id = 48983
    override val name = "通电机器人"
    override val description = "<b>战吼：</b>使你手牌中所有机械牌的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "补锌补脑，健康到老。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e95a519a8a2edfb0212d1b274216144b83222c2b8b46a550c6def976248335f8.png"
}

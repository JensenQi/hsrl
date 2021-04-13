package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneDynamo_49171 : Card() {
    override val id = 49171
    override val name = "奥能水母"
    override val description = "<b>战吼：</b><b>发现</b>一张法力值消耗大于或等于（5）点的法术牌。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "外表美丽却异常凶猛。触手能释放出电流，迅速将猎物麻痹致死。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/07797a6ce32fd8703744f2a9293a3908693a8f4236ee83648099a6522f213683.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NatTheDarkfisher_39046 : Card() {
    override val id = 39046
    override val name = "阴暗渔夫纳特"
    override val description = "你的对手在回合开始时，有50%的几率额外抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "或许你能夺走他的人性，但是你夺不走他的鱼杆！"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce6ef3e3cdc1bef642878934d50d4946f354b61ab37b937c880a945b033205e4.png"
}

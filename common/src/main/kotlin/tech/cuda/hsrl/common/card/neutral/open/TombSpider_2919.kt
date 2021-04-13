package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TombSpider_2919 : Card() {
    override val id = 2919
    override val name = "墓穴蜘蛛"
    override val description = "<b>战吼： 发现</b>一张野兽牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "墓穴蜘蛛最喜欢把探险者裹起来做存粮。"
    override val artist = "Turovec Konstantin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a75b679bfebb46a86c4d62f3e90352fc8ad5fccbb37752b362c4cb2c24fea293.png"
}

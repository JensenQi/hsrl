package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TanarisHogchopper_40611 : Card() {
    override val id = 40611
    override val name = "野猪骑士塔纳利"
    override val description = "<b>战吼：</b>如果你的对手没有手牌，便获得 <b>冲锋</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "塔纳利觉得能用暴力解决的事，都不算事。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b883c5ddb4c431bb2a522697c685a03f038529f236589913e4eb770931a9ae3.png"
}

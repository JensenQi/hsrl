package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LeathercladHogleader_40613 : Card() {
    override val id = 40613
    override val name = "野猪骑士蕾瑟兰"
    override val description = "<b>战吼：</b>如果你的对手拥有6张或者更多手牌，便获得<b>冲锋</b>。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "蕾瑟兰对于皮装有着特别的嗜好。她抢来的大部分钱财都用来做皮革保养了。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a9aee305400a7b3c4cd0a56ea4153a9e795a7f155c7e5d3438fdab04f5ca65a.png"
}

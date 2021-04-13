package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PantrySpider_39207 : Card() {
    override val id = 39207
    override val name = "橱柜蜘蛛"
    override val description = "<b>战吼：</b>召唤一只1/3的蜘蛛。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "不得不说，它俩还挺有夫妻相的。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e106dcc5eb81014e7f588062c84f95801e98253efb3b5015e495687c3f86391b.png"
}

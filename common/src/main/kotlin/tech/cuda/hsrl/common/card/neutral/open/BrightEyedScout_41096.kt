package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BrightEyedScout_41096 : Card() {
    override val id = 41096
    override val name = "热情的探险家"
    override val description = "<b>战吼：</b>抽一张牌，使其法力值消耗变为（5）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "能让她眼前一亮的不光是珍稀物种，还有纸杯蛋糕！"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/724c37ae57a1f3496fe5d785402c35491d0b68db4e6107b0b7248057b0476b2c.png"
}

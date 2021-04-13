package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EliseTheTrailblazer_41935 : Card() {
    override val id = 41935
    override val name = "“开拓者”伊莉斯"
    override val description = "<b>战吼：</b> 将一张<b>安戈洛卡牌包</b>洗入你的牌库。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "雷诺教导她别老跟着藏宝图走，要勇敢地踏上未知的旅途。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/224748bbf9fa4c45c76d2af1278677df72eb46b230ecd56617f04a407b6572a3.png"
}

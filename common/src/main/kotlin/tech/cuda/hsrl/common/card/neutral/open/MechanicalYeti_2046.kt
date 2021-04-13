package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MechanicalYeti_2046 : Card() {
    override val id = 2046
    override val name = "机械雪人"
    override val description = "<b>亡语：</b>使每个玩家获得一张<b>零件</b>牌。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "冰风岗的雪人不仅是蛮力的象征，更是工程师们创作灵感的源泉。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c140da14cfefa96cc8e4d1b47d4d25a482548f2d3284ddaf731df1edae100104.png"
}

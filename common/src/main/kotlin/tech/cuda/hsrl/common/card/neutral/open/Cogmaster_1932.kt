package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cogmaster_1932 : Card() {
    override val id = 1932
    override val name = "齿轮大师"
    override val description = "如果你控制任何机械，便获得 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "片刻之后，你看到的不再是齿轮和链条，它们可能变成了机器人、蜘蛛坦克、射线发射器和其他各种各样的装置……"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/990fc714b8b99468d57d410aed415d3aefb5ba352d886b30db02e295551e6748.png"
}

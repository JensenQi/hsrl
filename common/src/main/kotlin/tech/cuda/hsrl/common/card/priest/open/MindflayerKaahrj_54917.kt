package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindflayerKaahrj_54917 : Card() {
    override val id = 54917
    override val name = "夺心者卡什"
    override val description = "<b>战吼：</b>选择一个敌方随从。<b>亡语：</b>召唤一个所选随从的新的 复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "亲爱的朋友们，其实我并不是要偷走你们的心……"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82acbfd72163fc92e6baf6ca80dc5694cd3d230e5e32a78f027acb7276ef07f3.png"
}

package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonblightCultist_54888 : Card() {
    override val id = 54888
    override val name = "龙骨荒野异教徒"
    override val description = "<b>战吼：</b><b>祈求</b>迦拉克隆。每有一个其他友方随从，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "要是迦拉克隆在复活后发现自己的骨头上有咬痕，一定会陷入更深重的疯狂。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bcc6cd49fdd705f0aff2be1d94438ac625bf560460258256600d1210d546bd88.png"
}

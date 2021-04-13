package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FiendishRites_55251 : Card() {
    override val id = 55251
    override val name = "邪鬼仪式"
    override val description = "<b>祈求</b>迦拉克隆。使你的所有随从获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“你有权在仪式中献祭一个友方随从。如果你没有准备友方随从，系统会为你指定一个。”"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/09e10d9d84b48a7caf6b23dad6e531fbf767ab970acb705e20322b786848f90d.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DiscipleOfGalakrond_54874 : Card() {
    override val id = 54874
    override val name = "迦拉克隆的信徒"
    override val description = "<b>战吼：</b> <b>祈求</b>迦拉克隆。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "复活迦拉克隆会导致成吨、成吨的伤害。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd6471860cab27845f97d4eb7f9bd4213ea4633f53f45f0b87a30e427c463a4e.png"
}

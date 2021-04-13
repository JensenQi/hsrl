package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FateWeaver_54871 : Card() {
    override val id = 54871
    override val name = "命运编织者"
    override val description = "<b>战吼：</b>如果你已经<b>祈求</b>过两次，则使你的手牌法力值消耗减少（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "别被命运编织者发现，不然它会一直在你的命运里纠缠不清。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53fdefabc7eeb6f5a9a24d796897d36f96a86ecaebedcb32963190fb7fadd0a9.png"
}

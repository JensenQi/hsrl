package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorruptElementalist_54969 : Card() {
    override val id = 54969
    override val name = "堕落的元素师"
    override val description = "<b>战吼：</b><b>祈求</b>迦拉克隆两次。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "她最爱的视觉元素就是角。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f0f15a0e9f5b683dcf28dbc521dcc9a7e4360e00de2475a1bd61bf5861be641.png"
}

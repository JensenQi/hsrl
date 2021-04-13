package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TimeRip_55245 : Card() {
    override val id = 55245
    override val name = "时空裂痕"
    override val description = "消灭一个随从。<b>祈求</b>迦拉克隆。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "你的时间在此终结。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2814f79f946c9716bf85675e7e091180d78c9efb36a18ca2379d7a39a6a8bc15.png"
}

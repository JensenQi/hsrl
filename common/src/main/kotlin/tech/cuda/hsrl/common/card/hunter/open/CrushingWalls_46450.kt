package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrushingWalls_46450 : Card() {
    override val id = 46450
    override val name = "碾压墙"
    override val description = "消灭对手场上最左边和最右边的随从。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“情况还没到最糟！”“是啊，所以就变得更糟了。”"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29e1a63beb019d162bcefe678a7c47a8a6e6f7a3d69ebdee46fe232159a20617.png"
}

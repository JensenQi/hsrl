package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlazingBattlemage_55161 : Card() {
    override val id = 55161
    override val name = "灼光战斗法师"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "手中的上古热刀专切黄油。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c4b8856f2f90ebaf5f2c6c1ebb2ff18631bb80c7d3bc92bf4ce2d89a219e244.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonsHoard_55095 : Card() {
    override val id = 55095
    override val name = "巨龙宝藏"
    override val description = "<b>发现</b>一张另一职业的<b>传说</b> 随从牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "其实藏宝巨龙只有两个幸运币。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb7beaece872247082f214e67982c81b9799a5fd138bf2d7c22fea0e19879fb6.png"
}

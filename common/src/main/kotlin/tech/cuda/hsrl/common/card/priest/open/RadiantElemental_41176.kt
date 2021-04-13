package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RadiantElemental_41176 : Card() {
    override val id = 41176
    override val name = "光照元素"
    override val description = "你的法术的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "这可是纯天然的熔岩灯！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef39605aa9f2a62f47b343fbbdc6a0ed0ddb7a0eef19d3af737ea552b10542b6.png"
}

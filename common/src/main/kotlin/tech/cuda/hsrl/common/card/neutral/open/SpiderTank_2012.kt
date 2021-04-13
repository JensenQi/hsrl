package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiderTank_2012 : Card() {
    override val id = 2012
    override val name = "蜘蛛坦克"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "“我想在这家伙上面装上一门炮，你觉得怎么样?”菲兹布里兹看着蜘蛛运输装置说道。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e31edab0fab48dbd3859a5b060fcb7f56d727596e22a952cfa3c6209367961fd.png"
}

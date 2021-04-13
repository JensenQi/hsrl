package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Psychopomp_53935 : Card() {
    override val id = 53935
    override val name = "接引冥神"
    override val description = "<b>战吼：</b>随机召唤一个在本局对战中死亡的友方随从。使其获得 <b>复生</b>。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“想重生的话就跟我来。”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bba58256fd7f11b841b4787b668813d50b62e6ce6d400019652602f4f595035.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrazzledFreshman_59579 : Card() {
    override val id = 59579
    override val name = "疲倦的大一新生"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "三更灯火五更鸡，新生眼皮抬不起。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/754712e315433038f3310df41597cfa89122b340d24a52c516d07a5dcf50ef49.png"
}

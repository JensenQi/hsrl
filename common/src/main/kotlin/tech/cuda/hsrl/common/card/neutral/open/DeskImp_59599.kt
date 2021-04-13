package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeskImp_59599 : Card() {
    override val id = 59599
    override val name = "课桌小鬼"
    override val description = ""
    override var cost: Int? = null
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "喝最多的墨水，做最懂的小鬼。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c6a2d55508c35df23de1cfc3e59dac98d669a7e0aadfafb2c4dbec6b39fb69b.png"
}

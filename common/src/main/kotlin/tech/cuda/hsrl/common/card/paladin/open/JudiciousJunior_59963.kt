package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JudiciousJunior_59963 : Card() {
    override val id = 59963
    override val name = "踏实的大三学姐"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "就业难，升学苦，且迷且罔且努力。"
    override val artist = "Eric Browning"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80377c8ee919a149aede05609fa6e31f35ec0d458f5bd0213da90133c304807b.png"
}

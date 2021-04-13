package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GruntledPatron_62549 : Card() {
    override val id = 62549
    override val name = "满意的奴隶主"
    override val description = "<b>暴怒：</b>召唤另一个满意的奴隶主。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "奴隶主的满意建立在别人的暴怒之上。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b118778073a73478cb78f78b0a2b1ab408f335807950d600c5681a98e2bd157.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedVilefiend_56820 : Card() {
    override val id = 56820
    override val name = "被禁锢的邪犬"
    override val description = "<b>休眠</b>两回合。 <b>突袭</b>"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "贪睡一时爽，突袭跑断肠。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e07682319a011c96423f90cab1accf4a738723aea2e31bdb159e6a901821200c.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stormwatcher_69727 : Card() {
    override val id = 69727
    override val name = "风暴看守"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "他的另一份工作是气象预报员。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29434e3912397d9c54cdb39c897f588c4ff96ba55ccb174a7f9493c5ae562175.png"
}

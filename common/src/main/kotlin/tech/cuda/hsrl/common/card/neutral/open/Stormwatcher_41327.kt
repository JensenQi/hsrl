package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stormwatcher_41327 : Card() {
    override val id = 41327
    override val name = "风暴看守"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他的另一份工作是气象预报员。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c01a73e1a11ad9a41987f6ebea380fe38352622a0ae3498752026153e98d1c8e.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WretchedTiller_42398 : Card() {
    override val id = 42398
    override val name = "失心农夫"
    override val description = "每当该随从进行攻击，对敌方英雄造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "要是让你去永久冻土层上耕地，你也会失心疯的。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ba3b1e42a5a0c2defacc00f5c34c4f51bb0519edb1487268ddec0b3c8b4e4ae.png"
}

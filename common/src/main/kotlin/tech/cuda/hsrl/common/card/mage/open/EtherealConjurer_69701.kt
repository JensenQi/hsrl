package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtherealConjurer_69701 : Card() {
    override val id = 69701
    override val name = "虚灵巫师"
    override val description = "<b>战吼： 发现</b>一张法术牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "虽然听起来有点“虚”，但他的确很有实力。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6406206d5006fe941003a44f3797133a971fcad647c9f3a4369189f935e2e22c.png"
}

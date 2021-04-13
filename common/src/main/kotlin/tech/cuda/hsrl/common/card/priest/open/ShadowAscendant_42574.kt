package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowAscendant_42574 : Card() {
    override val id = 42574
    override val name = "暗影升腾者"
    override val description = "在你的回合结束时，随机使另一个友方随从获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "当你已经身处最底层时，只能往上升了。"
    override val artist = "Paul Kwon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/802870cbaf52c1ebefc422a13e0170d163f2a456a63b23b0b1886e91556d5e98.png"
}

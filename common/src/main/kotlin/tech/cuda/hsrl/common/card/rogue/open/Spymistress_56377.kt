package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spymistress_56377 : Card() {
    override val id = 56377
    override val name = "间谍女郎"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "外域的间谍必须和环境融为一体。于是她们有了亮粉色的套装和翠绿翠绿的头发。多诡异的环境。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/77b6a54dc5755f38985000dcd92fb04bf46d1906fc1cfdb1eeea4ef12ba3c108.png"
}

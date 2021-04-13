package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Squashling_48360 : Card() {
    override val id = 48360
    override val name = "南瓜宝宝"
    override val description = "<b>回响，战吼：</b>恢复 2点生命值。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "它们都很崇拜无头骑士。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3ebb82232e52f7bd64c7e380fa544282c310b867b1fcd7f31a871d93f60a6a4.png"
}

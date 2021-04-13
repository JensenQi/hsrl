package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlagueScientist_69708 : Card() {
    override val id = 69708
    override val name = "瘟疫科学家"
    override val description = "<b>连击：</b>使一个友方随从获得<b>剧毒</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "如果很痛，就说明起效了。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/899051378a34e54bfbb4e0d0585fe1f2b7e1cdf09ec1905be142e0fd672624c8.png"
}

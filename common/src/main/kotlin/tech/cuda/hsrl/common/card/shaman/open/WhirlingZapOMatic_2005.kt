package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhirlingZapOMatic_2005 : Card() {
    override val id = 2005
    override val name = "自动漩涡打击装置"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "这个打蛋器可好用了。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f5f6c6455cb1cb9fa420173f9913001044f8e2912b505deaec0fe5b7eaf62da.png"
}

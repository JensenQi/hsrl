package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaTideTotem_69631 : Card() {
    override val id = 69631
    override val name = "法力之潮图腾"
    override val description = "在你的回合结束时，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "据说，有些萨满能够以很快的速度连着说十遍“疼痛的图腾”。"
    override val artist = "Scott Altmann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/177051610dc86e255bfbf0396a99ac7844244dcff913891b73d20bf40615afa1.png"
}

package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaTideTotem_70032 : Card() {
    override val id = 70032
    override val name = "法力之潮图腾"
    override val description = "在你的回合结束时，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "据说，有些萨满能够以很快的速度连着说十遍“疼痛的图腾”。"
    override val artist = "Scott Altmann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b13641b663e0227706cd760b9ccc77bb8ee08e39bc11e5c1647ce07cc6e8f75.png"
}

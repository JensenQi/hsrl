package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaTideTotem_513 : Card() {
    override val id = 513
    override val name = "法力之潮图腾"
    override val description = "在你的回合结束时，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "据说，有些萨满能够以很快的速度连着说十遍“疼痛的图腾”。"
    override val artist = "Scott Altmann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/73e64db9116c46f285fadfbbabdb5d6c7cc03784e818fdcd98d2d32363000f59.png"
}

package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TinyfinsCaravan_63071 : Card() {
    override val id = 63071
    override val name = "鱼人宝宝车队"
    override val description = "在你的回合开始时，抽一张鱼人牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "这不是去鱼人幼儿园的车！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8526b6df0364770099f7640e86bde8b2d583eb81e8e2b724ed0ab05b27d09541.png"
}

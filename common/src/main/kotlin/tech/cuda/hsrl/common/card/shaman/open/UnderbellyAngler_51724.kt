package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnderbellyAngler_51724 : Card() {
    override val id = 51724
    override val name = "下水道渔人"
    override val description = "在你使用一张鱼人牌后，随机将一张鱼人牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "除了招鱼人，还会招蛾子……"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa2c5eb0ec731dac3457b0257ffe650595f344ebae6115db7c1a899f4d118c5c.png"
}

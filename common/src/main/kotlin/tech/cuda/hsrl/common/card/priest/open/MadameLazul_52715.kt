package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadameLazul_52715 : Card() {
    override val id = 52715
    override val name = "拉祖尔女士"
    override val description = "<b>战吼：</b><b>发现</b>一张你的对手手牌的复制。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "她当然能预见未来了，她一直盯着你的卡牌看呢！"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c644b5ff4f6dfc7453972405d57d0f8203835928404083ba2488f82965ff346.png"
}

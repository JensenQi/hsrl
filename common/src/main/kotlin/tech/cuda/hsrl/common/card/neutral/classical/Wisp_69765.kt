package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wisp_69765 : Card() {
    override val id = 69765
    override val name = "小精灵"
    override val description = ""
    override var cost: Int? = null
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你用足够多的小精灵攻击艾瑞达领主的话，他就会爆炸。但这是为什么呢？"
    override val artist = "Malcolm Davis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fac909a860a69e6539e86e016b29ada00b28bdc943c62b1d406a2233166e3309.png"
}

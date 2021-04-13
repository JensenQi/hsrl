package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnubisathSentinel_2933 : Card() {
    override val id = 2933
    override val name = "阿努比萨斯哨兵"
    override val description = "<b>亡语：</b>随机使一个友方随从获得+3/+3。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "作为亡者守护神阿努比萨斯的哨兵，最大的好处就是不用去死了。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2b09baca4414cd19016799d023238b5a558940362f6599fb46184b18e5e79df9.png"
}

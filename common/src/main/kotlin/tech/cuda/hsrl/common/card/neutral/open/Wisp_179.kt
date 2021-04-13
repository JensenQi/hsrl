package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wisp_179 : Card() {
    override val id = 179
    override val name = "小精灵"
    override val description = ""
    override var cost: Int? = null
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "如果你用足够多的小精灵攻击艾瑞达领主的话，他就会爆炸。但这是为什么呢？"
    override val artist = "Malcolm Davis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3e3fe3e92d144bbcb47ec62a6688c24a68b4980223e75b3e013876c53fc1a59.png"
}

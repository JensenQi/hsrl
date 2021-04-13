package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IgneousElemental_41926 : Card() {
    override val id = 41926
    override val name = "火岩元素"
    override val description = "<b>亡语：</b>将两张1/2的元素牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "那么问题来了，他到底算火元素，还是土元素呢？"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e2def907c25f03f870e24909203be46eedf572ff939c620efe1a9b1beb6969b.png"
}

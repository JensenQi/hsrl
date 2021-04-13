package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SenjinShieldmasta_69542 : Card() {
    override val id = 69542
    override val name = "森金持盾卫士"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "如果你喜欢巨魔和沙尘的话，森金村还是个不错的地方。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f2e5dfe117e3dbffc7a9654ba3286203be3c7610c4f2d500404c6889878a8192.png"
}

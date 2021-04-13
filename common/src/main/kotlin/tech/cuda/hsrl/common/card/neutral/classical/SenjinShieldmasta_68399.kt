package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SenjinShieldmasta_68399 : Card() {
    override val id = 68399
    override val name = "森金持盾卫士"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你喜欢巨魔和沙尘的话，森金村还是个不错的地方。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/faf58bbd9c26a7151ec8e79172ee0030643d9854e5097e402c1be5cb0faacc9d.png"
}

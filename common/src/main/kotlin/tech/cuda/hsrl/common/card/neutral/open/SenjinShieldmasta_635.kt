package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SenjinShieldmasta_635 : Card() {
    override val id = 635
    override val name = "森金持盾卫士"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "如果你喜欢巨魔和沙尘的话，森金村还是个不错的地方。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/271e36efc5356b14ce82e8ca4e67f70e466bd7d5a0202184239f0e26dbf5e252.png"
}

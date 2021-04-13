package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PriestessOfElune_70035 : Card() {
    override val id = 70035
    override val name = "艾露恩的女祭司"
    override val description = "<b>战吼：</b>为你的英雄恢复 4点生命值。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她是艾泽拉斯最早的“月光族”。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2f94bbc36c8249b14e25271039e1905e5c87d75823fa3005bb2411e1a07e3df.png"
}

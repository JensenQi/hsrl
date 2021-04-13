package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PriestessOfElune_424 : Card() {
    override val id = 424
    override val name = "艾露恩的女祭司"
    override val description = "<b>战吼：</b>为你的英雄恢复 4点生命值。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "她是艾泽拉斯最早的“月光族”。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa235392b215bc21ebacb2d9cc1d96ff581cde1039ae81e804c5db3cafb4fbd6.png"
}

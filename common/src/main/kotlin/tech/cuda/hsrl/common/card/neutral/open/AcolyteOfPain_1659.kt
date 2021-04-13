package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcolyteOfPain_1659 : Card() {
    override val id = 1659
    override val name = "苦痛侍僧"
    override val description = "每当该随从受到伤害，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "在他年轻的时候，他经受的是“快乐侍僧”的训练，但是训练成果并不如他想象的那么好。"
    override val artist = "Dave Kendall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50e9077bcad009f193b518ac2c346995844f4db00312bbc66517e83a6ac6ead4.png"
}

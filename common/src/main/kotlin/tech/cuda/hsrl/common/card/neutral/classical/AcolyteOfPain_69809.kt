package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcolyteOfPain_69809 : Card() {
    override val id = 69809
    override val name = "苦痛侍僧"
    override val description = "每当该随从受到伤害，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "在他年轻的时候，他经受的是“快乐侍僧”的训练，但是训练成果并不如他想象的那么好。"
    override val artist = "Dave Kendall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/246e730fcfec277077c1efff41bea93010ca927f983ccf9bb227e6ee0eec5f70.png"
}

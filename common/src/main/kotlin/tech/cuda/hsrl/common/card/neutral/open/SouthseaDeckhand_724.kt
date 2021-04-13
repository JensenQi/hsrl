package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthseaDeckhand_724 : Card() {
    override val id = 724
    override val name = "南海船工"
    override val description = "如果你装备一把武器，该随从具有 <b>冲锋</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "海盗们都非常热衷于这项新的时尚活动：“趴甲板”。"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/343b2f531fd110628187ce472dfa78ce92365eddf3ad5bb41bb9ec2bc5e7b7d7.png"
}

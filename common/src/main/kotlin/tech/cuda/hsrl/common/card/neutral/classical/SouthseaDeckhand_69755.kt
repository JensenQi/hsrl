package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthseaDeckhand_69755 : Card() {
    override val id = 69755
    override val name = "南海船工"
    override val description = "如果你装备一把武器，该随从具有 <b>冲锋</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "海盗们都非常热衷于这项新的时尚活动：“趴甲板”。"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81c4a3a38e36eacd87824aaa7701e09edc00777c754636e7eb92c3ef8484b53c.png"
}

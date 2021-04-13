package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentSquire_69810 : Card() {
    override val id = 69810
    override val name = "银色侍从"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“在此我严正宣誓：追随圣光，净化黑暗，只吃煎饼。”——银色黎明之誓"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ec2ba056893c39451f86fe02ca80623e5349d41d6cfc686e49009d7a65efa10.png"
}

package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentSquire_69653 : Card() {
    override val id = 69653
    override val name = "银色侍从"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“在此我严正宣誓：追随圣光，净化黑暗，只吃煎饼。”——银色黎明之誓"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/527a992a1b0c49fcf5239ba76c90bd553b9ac9389c3459bffd6f32877837839e.png"
}

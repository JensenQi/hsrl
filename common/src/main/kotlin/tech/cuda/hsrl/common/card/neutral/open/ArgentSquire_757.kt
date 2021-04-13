package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentSquire_757 : Card() {
    override val id = 757
    override val name = "银色侍从"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "“在此我严正宣誓：追随圣光，净化黑暗，只吃煎饼。”——银色黎明之誓"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea206735e7917974e1e9f1060e15bcd752c4e0840497a12948c744c69c5be8d4.png"
}

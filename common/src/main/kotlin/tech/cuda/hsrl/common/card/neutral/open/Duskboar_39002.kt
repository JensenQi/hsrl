package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Duskboar_39002 : Card() {
    override val id = 39002
    override val name = "暮色野猪"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "虽然样子有些怪异，但味道堪称一绝！"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18691eeb16e2dd6a1605e53e9e53f5d39c65032b047c072c254114733f06c36b.png"
}

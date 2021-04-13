package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DireWolfAlpha_69668 : Card() {
    override val id = 69668
    override val name = "恐狼前锋"
    override val description = "相邻的随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "这支球队没有后卫。"
    override val artist = "John Dickenson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab15a48b98acff708580b2cb6eb0f13c22c0dd08faab8d6d619f6e5eb61d2845.png"
}

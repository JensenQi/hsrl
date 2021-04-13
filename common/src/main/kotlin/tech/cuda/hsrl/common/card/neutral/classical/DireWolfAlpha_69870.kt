package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DireWolfAlpha_69870 : Card() {
    override val id = 69870
    override val name = "恐狼前锋"
    override val description = "相邻的随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "这支球队没有后卫。"
    override val artist = "John Dickenson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5030e4b5db51ac66e00fb4f02ccdd6c5f4cd82acbd1d2527012b73194d122798.png"
}

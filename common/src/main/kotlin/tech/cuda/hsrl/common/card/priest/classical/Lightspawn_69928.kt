package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightspawn_69928 : Card() {
    override val id = 69928
    override val name = "光耀之子"
    override val description = "该随从的攻击力始终等同于其生命值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "光耀孕育之子嗣，吾等子嗣之光耀。"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2d9082efbcd02207b7aaef51bda9476ee59f2c5eac9733ee2de0cb59f128a98.png"
}

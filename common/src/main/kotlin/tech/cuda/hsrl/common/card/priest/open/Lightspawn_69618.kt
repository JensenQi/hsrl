package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightspawn_69618 : Card() {
    override val id = 69618
    override val name = "光耀之子"
    override val description = "该随从的攻击力始终等同于其生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "光耀孕育之子嗣，吾等子嗣之光耀。"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8bcbd72a871859893c40c1786c48dc60cd7e654262490dc38aec03aa64940b8d.png"
}

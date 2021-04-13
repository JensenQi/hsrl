package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VilespineSlayer_41217 : Card() {
    override val id = 41217
    override val name = "邪脊吞噬者"
    override val description = "<b>连击：</b> 消灭一个随从。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "它会用舌头抽晕你，再把你吞下去。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ca8e890bad462da8e45e20e3227f5a7ee44d6ddc75b35d477ae8c6eec1cd273.png"
}

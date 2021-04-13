package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Toxicologist_69711 : Card() {
    override val id = 69711
    override val name = "毒物学家"
    override val description = "<b>战吼：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "让她辅修烹饪学显然是个错误。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3dcbd468a19128b336e66bc8021ef0cd0a9d1c3c6520971d96a6c6abd10cce37.png"
}

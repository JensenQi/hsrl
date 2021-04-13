package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Toxicologist_48034 : Card() {
    override val id = 48034
    override val name = "毒物学家"
    override val description = "<b>战吼：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "让她辅修烹饪学显然是个错误。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d1c41bb0c8bd4829ac5fcf16fa413440b43472230201a0530b01336bcaeb764.png"
}

package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladedCultist_69743 : Card() {
    override val id = 69743
    override val name = "执刃教徒"
    override val description = "<b>连击：</b>获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "别以为普通教徒没什么战斗力，尝尝我手中的利刃吧！"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/213c1fbc0ebf07c9563707960997082effeb53bee128b0fb56740adeb7b8a139.png"
}

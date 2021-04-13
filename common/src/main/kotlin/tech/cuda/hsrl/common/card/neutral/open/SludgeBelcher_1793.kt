package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SludgeBelcher_1793 : Card() {
    override val id = 1793
    override val name = "淤泥喷射者"
    override val description = "<b>嘲讽，亡语：</b>召唤一个1/2并具有<b>嘲讽</b>的泥浆怪。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "千万别让他喝碳酸饮料！"
    override val artist = "Nate Bowden"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa62293834b1556bf28d03ba1f13a7df940c3fce836e0c0823cb321b5c375e48.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiAgent_1117 : Card() {
    override val id = 1117
    override val name = "军情七处特工"
    override val description = "<b>连击：</b>造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "军情七处的特工们负责暴风城内的所有隐秘行动，包括间谍活动、暗杀以及秘密筹备皇室成员的生日派对。"
    override val artist = "Chris Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/09317e36567cf1626549daef232a493afabf54292c46a3209626e0b870cdb343.png"
}

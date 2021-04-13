package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PsycheSplit_56598 : Card() {
    override val id = 56598
    override val name = "心灵分裂"
    override val description = "使一个随从获得+1/+2，并召唤一个它的复制。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这就是鸦人的交友方式。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/503e6d147527ed8b3d2591bcadfd78568bb2558ef44ea96dd5075ed6be48e95d.png"
}

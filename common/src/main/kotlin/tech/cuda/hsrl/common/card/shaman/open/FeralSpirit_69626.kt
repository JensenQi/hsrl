package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeralSpirit_69626 : Card() {
    override val id = 69626
    override val name = "野性狼魂"
    override val description = "召唤两只2/3并具有<b>嘲讽</b>的幽灵狼。<b>过载：</b>（1）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "幽灵狼只是普通的狼而已，它们擅长发出吓人的寒光。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3c93852033eb72e4c7575af96410d3b9909ceb532822b7cc07f2ec181f255b8.png"
}

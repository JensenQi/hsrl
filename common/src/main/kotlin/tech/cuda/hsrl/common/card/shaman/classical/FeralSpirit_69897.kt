package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeralSpirit_69897 : Card() {
    override val id = 69897
    override val name = "野性狼魂"
    override val description = "召唤两只2/3并具有<b>嘲讽</b>的幽灵狼。<b>过载：</b>（2）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "幽灵狼只是普通的狼而已，它们擅长发出吓人的寒光。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/07fd2a8d3bc36c5b66f5d6d810739becfa64d56146f073ba9005259ae95f1d38.png"
}

package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeralSpirit_238 : Card() {
    override val id = 238
    override val name = "野性狼魂"
    override val description = "召唤两只2/3并具有<b>嘲讽</b>的幽灵狼。<b>过载：</b>（1）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "幽灵狼只是普通的狼而已，它们擅长发出吓人的寒光。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e40c7fde522b0474f6998da339ae77033996ad7ae0f13d39c2f1c995f075299e.png"
}

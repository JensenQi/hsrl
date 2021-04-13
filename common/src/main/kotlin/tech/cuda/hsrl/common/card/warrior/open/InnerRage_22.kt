package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InnerRage_22 : Card() {
    override val id = 22
    override val name = "怒火中烧"
    override val description = "对一个随从造成 1点伤害，该随从获得+2攻击力。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "吃得苦中苦，方为人上人。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/62885e1fa37e5c62e85ebe8da62a92f0d26f9562bc3639626de8d254de724458.png"
}

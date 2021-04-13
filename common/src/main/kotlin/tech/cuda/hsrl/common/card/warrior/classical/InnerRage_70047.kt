package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InnerRage_70047 : Card() {
    override val id = 70047
    override val name = "怒火中烧"
    override val description = "对一个随从造成 1点伤害，该随从获得+2攻击力。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "吃得苦中苦，方为人上人。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cef3599010384486d3d7eee10531ddd9ea88996f6d9d4f4ef736d4002335642f.png"
}

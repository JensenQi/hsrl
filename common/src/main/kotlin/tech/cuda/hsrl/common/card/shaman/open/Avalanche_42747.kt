package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Avalanche_42747 : Card() {
    override val id = 42747
    override val name = "雪崩"
    override val description = "<b>冻结</b>一个随从，并对其相邻的随从造成 3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "“打雪仗”的终极版。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/293631b0a3aa9ffc3502404b3410363817cb3e8be384cfc5e5761bb858aa3993.png"
}

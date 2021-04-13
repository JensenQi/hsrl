package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Backstab_69521 : Card() {
    override val id = 69521
    override val name = "背刺"
    override val description = "对一个未受伤的随从造成 2点 伤害。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "大叫着“看那儿！”，然后让你的对手背对着你，这一招总是出奇地有效。"
    override val artist = "Michael Sutfin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/870af35330507eb336f26b72fbc636bb2ffd5037b54b73d185635466fef13871.png"
}

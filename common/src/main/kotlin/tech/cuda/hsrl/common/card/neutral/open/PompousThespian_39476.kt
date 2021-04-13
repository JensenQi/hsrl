package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PompousThespian_39476 : Card() {
    override val id = 39476
    override val name = "自负的演员"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "曾经有人匿名送给他一本书，叫《演员的自我修养》。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ffb957a2353dbabd40833a05b7edb3a5e248e4c3be8882cac6c1614d4f23fd18.png"
}

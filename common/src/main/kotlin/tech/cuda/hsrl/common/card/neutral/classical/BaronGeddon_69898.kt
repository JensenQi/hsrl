package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaronGeddon_69898 : Card() {
    override val id = 69898
    override val name = "迦顿男爵"
    override val description = "在你的回合结束时，对所有其他角色造成2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "迦顿男爵曾经是拉格纳罗斯的首席副官，因为他实在太“火”了。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/319a87d8dbab715da678aecafab57753fe68526d922a0165a5000c2dc81b20b1.png"
}

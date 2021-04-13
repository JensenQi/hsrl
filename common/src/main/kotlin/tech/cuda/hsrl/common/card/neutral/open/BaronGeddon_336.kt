package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaronGeddon_336 : Card() {
    override val id = 336
    override val name = "迦顿男爵"
    override val description = "在你的回合结束时，对所有其他角色造成2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "迦顿男爵曾经是拉格纳罗斯的首席副官，因为他实在太“火”了。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29c16b2416e6ac76ee197601ba263cf3fe9dbbe790321b11b8ddd8c412a85502.png"
}

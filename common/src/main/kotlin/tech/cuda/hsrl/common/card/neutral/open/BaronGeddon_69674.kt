package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaronGeddon_69674 : Card() {
    override val id = 69674
    override val name = "迦顿男爵"
    override val description = "在你的回合结束时，对所有其他角色造成2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "迦顿男爵曾经是拉格纳罗斯的首席副官，因为他实在太“火”了。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ba0812f53c37aa43c39f087c9c65e16b086f2e995380c55d6ab39435a150025.png"
}

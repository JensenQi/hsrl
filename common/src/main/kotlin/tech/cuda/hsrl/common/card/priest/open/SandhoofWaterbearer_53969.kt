package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SandhoofWaterbearer_53969 : Card() {
    override val id = 53969
    override val name = "沙蹄搬水工"
    override val description = "在你的回合结束时，为一个受伤的友方角色恢复 5点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "曾经carry过全场的大牛。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8895f93493ff3fa7a02a15fc29697dbbad0bd3129afd6648c4d6fbde4006df17.png"
}

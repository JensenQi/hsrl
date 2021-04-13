package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodmageThalnos_69813 : Card() {
    override val id = 69813
    override val name = "血法师萨尔诺斯"
    override val description = "<b>法术伤害+1</b>，<b>亡语：</b>抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他负责每年一度的血色修道院献血运动！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/98eb87f2706538f96f9a695d103eef7cdc86d9bbe76d3cc0084abc94d51c58ee.png"
}

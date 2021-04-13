package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AstromancerSolarian_56717 : Card() {
    override val id = 56717
    override val name = "星术师索兰莉安"
    override val description = "<b>法术伤害+1</b> <b>亡语：</b>将“终极索兰莉安”洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这位忠于凯尔萨斯·逐日者的血精灵法师在虚空中寻求着奥术能量。她找到了吗……或者说，“它”找上她了吗？"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f5003a87b0533fb0f64a6b1b8c2f1af4f8e62981a9d5d10d8b83b0658bd47a52.png"
}

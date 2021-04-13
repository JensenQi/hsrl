package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Icehowl_2725 : Card() {
    override val id = 2725
    override val name = "冰吼"
    override val description = "<b>冲锋</b> 无法攻击英雄。"
    override var cost: Int? = 9
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "这个巨型雪人只管闭着眼睛，向距离最近的目标发起冲锋。可距离最近的目标也远在几个街区之外，而且还是个滑板高手。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ad54a8715e149a967410d2c1af5d3c70cdd222a4df2a92f88fc872eb6e18d52.png"
}

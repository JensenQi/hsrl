package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForceTankMax_2047 : Card() {
    override val id = 2047
    override val name = "强袭坦克"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "在塔纳利斯，有一间生产强袭坦克的兵工厂，但由于其巨额成本，仅有两辆坦克被生产出来。"
    override val artist = "Nutchapol Thitinunthakorn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88f21f9c685dbf622007841fa821dc8dfb6fa4a7ba61d0f680233320928d94e1.png"
}

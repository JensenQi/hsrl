package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kalecgos_53002 : Card() {
    override val id = 53002
    override val name = "卡雷苟斯"
    override val description = "你每个回合使用的第一张法术牌的法力值消耗为（0）点。<b>战吼：</b><b>发现</b>一张法术牌。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他曾是魔法的守护者，但最终放弃了这一身份，转而潜心研究魔法。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7709be28d3ef24e0501a440af15e611a650bbd064de6832a2bd07ebd11bfec6e.png"
}

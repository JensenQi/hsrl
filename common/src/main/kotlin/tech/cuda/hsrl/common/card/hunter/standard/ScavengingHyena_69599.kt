package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScavengingHyena_69599 : Card() {
    override val id = 69599
    override val name = "食腐土狼"
    override val description = "每当一个友方野兽死亡，便获得+2/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "土狼偏爱科多兽和风蛇的骨头，但是其实他们什么都吃。甚至是抱子甘蓝。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d48948d916d1e35dfc678fc296c2c10fcaa58b2a0413c72e9cc74e35755986c.png"
}

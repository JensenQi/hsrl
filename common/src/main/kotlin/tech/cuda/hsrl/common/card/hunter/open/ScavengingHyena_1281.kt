package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScavengingHyena_1281 : Card() {
    override val id = 1281
    override val name = "食腐土狼"
    override val description = "每当一个友方野兽死亡，便获得+2/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "土狼偏爱科多兽和风蛇的骨头，但是其实他们什么都吃。甚至是抱子甘蓝。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac44d2f9e21332d13d77cd07a716cc8fcdc824040e9a5df5e31e59aa5bb51e35.png"
}

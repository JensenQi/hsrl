package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScavengingHyena_69962 : Card() {
    override val id = 69962
    override val name = "食腐土狼"
    override val description = "每当一个友方野兽死亡，便获得+2/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "土狼偏爱科多兽和风蛇的骨头，但是其实他们什么都吃。甚至是抱子甘蓝。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca4476b2f0ac32e39bb0d0e2e0db8818183222b30df69f4d1c63079efdbd17b2.png"
}

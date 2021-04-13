package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrimsonClergy_62498 : Card() {
    override val id = 62498
    override val name = "赤红教士"
    override val description = "在一个友方角色获得治疗后，获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "个人生涯一球未失。"
    override val artist = "Konstantin Porubov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a01d8b117d41a0ea9c9b8a23b63834b386d0ce7ea12a99d93c466387b289f41.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PriestOfTheFeast_39442 : Card() {
    override val id = 39442
    override val name = "宴会牧师"
    override val description = "每当你施放一个法术，为你的英雄恢复 3点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Karazhan
    override val background = "宴会牧师最厉害的本领，就是圣言术：吃！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f5e432896071637e6d777df9c2a46271a6451dc83dc39c03433f81319199188c.png"
}

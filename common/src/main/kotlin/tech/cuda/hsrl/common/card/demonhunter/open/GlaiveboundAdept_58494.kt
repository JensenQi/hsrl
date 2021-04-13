package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlaiveboundAdept_58494 : Card() {
    override val id = 58494
    override val name = "刃缚精锐"
    override val description = "<b>战吼：</b>在本回合中，如果你的英雄进行过攻击，则造成4点 伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "“这是你的战刃，新兵。把它当作你身体的延伸……你刚把它扔出去了？！”"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b24c48938df8dda42d73e6e53b8b763186dc341192d3894fff5817bf418b2d8e.png"
}

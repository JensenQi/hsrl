package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SmolderthornLancer_50059 : Card() {
    override val id = 50059
    override val name = "燃棘枪兵"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则消灭一个受伤的敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "糟糕，是扎心的感觉。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/800f687635c6cd75c568e3940eb7a35bb20eb060b59c3ec31e59234b706fe516.png"
}

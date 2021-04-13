package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScionOfRuin_55000 : Card() {
    override val id = 55000
    override val name = "废墟之子"
    override val description = "<b>突袭</b> <b>战吼：</b>如果你已经<b>祈求</b>过两次，召唤该随从的两个复制。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "废了！全废了！"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e16112de5941296bfbb636583b53329348138543278b16543d908b8b4a4ca80.png"
}

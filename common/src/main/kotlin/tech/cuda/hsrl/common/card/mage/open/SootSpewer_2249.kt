package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SootSpewer_2249 : Card() {
    override val id = 2249
    override val name = "煤烟喷吐装置"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "地精发明家们从来不会考虑环保和安全这两个因素；而他们认为正是这一点使他们的发明更加出类拔萃。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/130796abfc8bd6e933388ed736b03418318c85775051ecd7bc38b9d401806e13.png"
}

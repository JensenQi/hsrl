package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RammingSpeed_55003 : Card() {
    override val id = 55003
    override val name = "横冲直撞"
    override val description = "迫使一个随从攻击相邻的一个 随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "她的保费不断上浮。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f10b9ef8583299ef1708683de9214f648cdf1c2e760924a3f813b59a321be04c.png"
}

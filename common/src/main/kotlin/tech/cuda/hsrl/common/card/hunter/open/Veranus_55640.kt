package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Veranus_55640 : Card() {
    override val id = 55640
    override val name = "维拉努斯"
    override val description = "<b>战吼：</b>将所有敌方随从的生命值变为1。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "作为空巢老龙，她这么做只是因为怀念她的“小”家伙们。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1591bd4b16bc6bfa3c64b710d6973b2c6af5471fdced7bf749eaa32caa509d88.png"
}

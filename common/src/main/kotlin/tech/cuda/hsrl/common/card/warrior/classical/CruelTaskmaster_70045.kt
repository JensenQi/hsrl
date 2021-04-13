package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CruelTaskmaster_70045 : Card() {
    override val id = 70045
    override val name = "严酷的监工"
    override val description = "<b>战吼：</b>对一个随从造成1点伤害，并使其获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "“这个周末你们必须来加班。”——严酷的监工"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/03b1b1cac136dfe523bce75d6ca88fbb99544e46d1fbd0312faefb516ce4b127.png"
}

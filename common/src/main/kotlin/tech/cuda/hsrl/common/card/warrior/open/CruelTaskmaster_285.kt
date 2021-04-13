package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CruelTaskmaster_285 : Card() {
    override val id = 285
    override val name = "严酷的监工"
    override val description = "<b>战吼：</b>对一个随从造成1点伤害，并使其获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "“这个周末你们必须来加班。”——严酷的监工"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a602f9f9c4bd65bc694f766ed1c0d3d9f6ca7e7ba3e6d20d4d96630c15853f28.png"
}

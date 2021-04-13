package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CruelTaskmaster_69644 : Card() {
    override val id = 69644
    override val name = "严酷的监工"
    override val description = "<b>战吼：</b>对一个随从造成1点伤害，并使其获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "“这个周末你们必须来加班。”——严酷的监工"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb536d2a84c4474a3c6cc8f3da5a7dc9ee5e9a9d828e010d9d1dfe924aa020b4.png"
}

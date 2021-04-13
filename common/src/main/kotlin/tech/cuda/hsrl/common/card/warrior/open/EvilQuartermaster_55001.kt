package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilQuartermaster_55001 : Card() {
    override val id = 55001
    override val name = "怪盗军需官"
    override val description = "<b>战吼：</b>将一张<b>跟班</b>牌置入你的手牌。获得3点护甲值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "治军之道，需则实之，实则需之。"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29401bc55e95ea49f6ae242a53451c8cb5d44f7447e583dcc8eefb1f0c05e061.png"
}

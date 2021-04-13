package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnakeTrap_455 : Card() {
    override val id = 455
    override val name = "毒蛇陷阱"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，召唤三条1/1的蛇。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "蛇。为什么是蛇？"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b182627551c79525dfbba5f2f5dba38e06ef8ed1570b62d36c21429e66a08375.png"
}

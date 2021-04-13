package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnakeTrap_69602 : Card() {
    override val id = 69602
    override val name = "毒蛇陷阱"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，召唤三条1/1的蛇。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "蛇。为什么是蛇？"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ba3f12a5aa66284d1fc4e0971515419a77384c7e24547636a873618281c58ba.png"
}

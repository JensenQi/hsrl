package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnakeTrap_69971 : Card() {
    override val id = 69971
    override val name = "毒蛇陷阱"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，召唤三条1/1的蛇。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "蛇。为什么是蛇？"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c55896ae8c01018aca9b274ffa73d2d4954a0b83e60283908246839abe381208.png"
}

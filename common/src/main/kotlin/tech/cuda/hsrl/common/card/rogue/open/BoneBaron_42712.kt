package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoneBaron_42712 : Card() {
    override val id = 42712
    override val name = "白骨大亨"
    override val description = "<b>亡语：</b> 将两张1/1的“骷髅”置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "不论是石油大亨、铁路大亨还是黑金大亨，最后都会变成白骨大亨。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a783ed07fb47e2c52d5703df913f1e93547fc9b478e16d075b7d4af4247115c7.png"
}

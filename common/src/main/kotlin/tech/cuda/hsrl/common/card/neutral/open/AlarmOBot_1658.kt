package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlarmOBot_1658 : Card() {
    override val id = 1658
    override val name = "报警机器人"
    override val description = "在你的回合开始时，随机将你的手牌中的一张随从牌与该随从 交换。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "警报。警报。警报。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/377adc32bd11696f4a5e591d9f63032a778af638905fb86788352793038e4853.png"
}

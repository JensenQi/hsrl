package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlarmOBot_69808 : Card() {
    override val id = 69808
    override val name = "报警机器人"
    override val description = "在你的回合开始时，随机将你的手牌中的一张随从牌与该随从 交换。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "警报。警报。警报。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/511d2126afabb4f131ff5222ba777b92ea69b94ec186eb47b160e3c2e9ac1254.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hobgoblin_2072 : Card() {
    override val id = 2072
    override val name = "大胖"
    override val description = "每当你使用一张攻击力为1的随从牌，便使其获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "大地精们将在下个星期召开联合会议。会议的第一项议题是：建立一个牙科诊所。"
    override val artist = "Laurel Austin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a92290d2e75f8a408edf954bf3efce8b6d471759475141bf0a1f6466f06ad38.png"
}

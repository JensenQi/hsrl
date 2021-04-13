package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DancingSwords_1913 : Card() {
    override val id = 1913
    override val name = "舞动之剑"
    override val description = "<b>亡语：</b>你的对手抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "请欣赏他们的瑞格舞步。"
    override val artist = "Jon McConnell"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b5a5f95433841822b01be9854dd570c1a0a1cd0edd5f0db8433109496d7ed25.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CultNeophyte_60043 : Card() {
    override val id = 60043
    override val name = "异教低阶牧师"
    override val description = "<b>战吼：</b>下个回合你的对手法术的法力值消耗增加（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "新手牧师，让对手无法可施。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a32023439bb8176301c46eba582c8e520824d2db26195c96fe0acbf7c81e4e8.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TicketScalper_49066 : Card() {
    override val id = 49066
    override val name = "黑心票贩"
    override val description = "<b>超杀</b>：抽两张牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "按原价的三倍出售！"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1c6341409b55b82743c65fe0fccd2c1fdc794b33c8f26f89e627b2225c78cd41.png"
}

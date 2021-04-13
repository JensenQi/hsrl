package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecklessRocketeer_68408 : Card() {
    override val id = 68408
    override val name = "鲁莽火箭兵"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "一个疯狂的火箭兵加上一个装满炸药的火箭。完美的组合。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4261757f30033ae4e8cff25fd60dcc978f5042f617a58c70397f6391054861d8.png"
}

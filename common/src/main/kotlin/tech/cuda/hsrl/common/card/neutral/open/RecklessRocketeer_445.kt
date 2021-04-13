package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecklessRocketeer_445 : Card() {
    override val id = 445
    override val name = "鲁莽火箭兵"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "一个疯狂的火箭兵加上一个装满炸药的火箭。完美的组合。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99c5d922c1c4ccc13cf848081834d0ef6d77b5934c957907ea410d7b3eadef18.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WorgenGreaser_40950 : Card() {
    override val id = 40950
    override val name = "狼人欺诈者"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "他的薪水有79%都拿去买发蜡了。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e086d9e8f61024495b8db7bfc42e6831ac51843c03b69656bcd8ccead6e36aba.png"
}

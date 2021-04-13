package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ultrasaur_41315 : Card() {
    override val id = 41315
    override val name = "摩天龙"
    override val description = ""
    override var cost: Int? = 10
    override var health: Int? = 14
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "听说顺着他的脖子往上爬，会找到下金蛋的鹅。"
    override val artist = "Laurel Austin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f299b95aeb22534b83ae888dbab0adad26f5d930067d84159dae0e99f5fc3f7a.png"
}

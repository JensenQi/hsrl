package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SerpentEgg_54077 : Card() {
    override val id = 54077
    override val name = "海蛇蛋"
    override val description = "<b>亡语：</b>召唤一条3/4的海蛇。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "上一秒还是可爱的蛋蛋，下一秒就变成了致命的海蛇。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b2a0e5075f33046e60223a8587375d1d605445af13e44489c6b869d8a939e1e.png"
}

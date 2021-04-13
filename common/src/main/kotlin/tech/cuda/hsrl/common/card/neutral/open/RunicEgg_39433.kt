package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RunicEgg_39433 : Card() {
    override val id = 39433
    override val name = "符文蛋"
    override val description = "<b>亡语：</b>抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "符文蛋饼异常美味，鲜香嫩滑回味无穷！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a81d027a66686afc34d04811f3185e886a7740a78cfdb96643f9328e7a2ed3ea.png"
}

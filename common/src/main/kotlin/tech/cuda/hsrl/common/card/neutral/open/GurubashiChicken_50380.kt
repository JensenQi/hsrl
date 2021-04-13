package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GurubashiChicken_50380 : Card() {
    override val id = 50380
    override val name = "古拉巴什小鸡"
    override val description = "<b>超杀：</b> 获得+5攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“抓住它的脚，伙计。扔吧。”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/911ea2546583d4d68a802eef52d65fbabe8527ede783521d4a3f628e176ea688.png"
}

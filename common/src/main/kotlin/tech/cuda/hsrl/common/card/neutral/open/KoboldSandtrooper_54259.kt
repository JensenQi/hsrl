package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldSandtrooper_54259 : Card() {
    override val id = 54259
    override val name = "狗头人沙漠步兵"
    override val description = "<b>亡语：</b>对敌方英雄造成3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "英雄请留步，且吃我一蜡烛。"
    override val artist = "Christopher Hayes"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb5e969041b405a8a88e97d0c3255ce42c5f00500abe4ef52e2ed7c1c851b82d.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GnomereganInfantry_2066 : Card() {
    override val id = 2066
    override val name = "诺莫瑞根步兵"
    override val description = "<b>冲锋，嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "侏儒士兵们英勇无畏，他们随时准备着回到他们那饱受辐射的、通风糟糕的家园！"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea1d9abab69625badb7ec0a2aaa969d1e7658760064590e0b7661b3ad51127ec.png"
}

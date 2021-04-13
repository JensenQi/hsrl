package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldGeomancer_69539 : Card() {
    override val id = 69539
    override val name = "狗头人地卜师"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "在过去，狗头人是这片土地上最好的蜡烛交易商，直到它们被逼太甚..."
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/960771f820b3635013f69160670f271328de46e3d0995d24f29545c0ea82319c.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldGeomancer_672 : Card() {
    override val id = 672
    override val name = "狗头人地卜师"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "在过去，狗头人是这片土地上最好的蜡烛交易商，直到它们被逼太甚..."
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84f1f85398557a9114a61ea18940969c0867b276cc90d52d29f450cebc1641cf.png"
}

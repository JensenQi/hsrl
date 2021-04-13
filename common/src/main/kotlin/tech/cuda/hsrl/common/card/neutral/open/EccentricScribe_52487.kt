package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EccentricScribe_52487 : Card() {
    override val id = 52487
    override val name = "古怪的铭文师"
    override val description = "<b>亡语：</b>召唤四个1/1的复仇卷轴。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "卷轴上写着“家长签字”！"
    override val artist = "Charlene LeScanff"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb7820fddb4bb384af3fdf7c0790644bc1fa5deaae3f979c7cdeb12cfd4b1d7d.png"
}

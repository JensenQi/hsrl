package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CandleBreath_55101 : Card() {
    override val id = 55101
    override val name = "烛火吐息"
    override val description = "抽三张牌。如果你的手牌中有龙牌，这张牌的法力值消耗减少（3）点。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“蜡烛巨龙燃烈火， 灼灼龙息似柴烧！ 恶信徒，齐来到， 纷纷举烛迎空招！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ddca2f2321ee0e0f0a22768ca0f19ee3c5e514e52f2d3b19d88f4197f7da30f1.png"
}

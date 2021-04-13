package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DalaranCrusader_52285 : Card() {
    override val id = 52285
    override val name = "达拉然圣剑士"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "唯有甜甜圈可以让这位达拉然的执法者放慢脚步。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3480b1188863b8542c27ca39f0320cdb632959680bc09c5ff3602c87b1ab80e5.png"
}

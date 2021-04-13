package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WickedWitchdoctor_39190 : Card() {
    override val id = 39190
    override val name = "邪恶的巫医"
    override val description = "每当你施放一个法术，随机召唤一个基础图腾。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Karazhan
    override val background = "对付女巫有两种办法：要么对她造成4点伤害，要么点燃她脚下的那堆柴火。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe33c45fde6598291180c5536d65e79a1c2af48aedef9e9af84f147d09f0320b.png"
}

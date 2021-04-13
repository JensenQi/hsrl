package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwampDragonEgg_48106 : Card() {
    override val id = 48106
    override val name = "沼泽龙蛋"
    override val description = "<b>亡语：</b>随机将一张龙牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "据说这种时候的蛋营养价值特别高，但很多人还是难以接受。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d3159203944e6e2e263ee845b23253e3f2a7b742715dd404dad37deba9be7a9.png"
}

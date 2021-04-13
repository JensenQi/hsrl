package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTinyfin_69723 : Card() {
    override val id = 69723
    override val name = "鱼人宝宝"
    override val description = ""
    override var cost: Int? = null
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "鱼人宝宝实在是太可爱了，以至于谁见了都想抱一抱，结果因窒息所导致的死亡率极高。"
    override val artist = "Oliver Chipping"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5578695cf89e58344350c392407f8a493e93e4ee234b3261094b5304d4945b3.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTinyfin_13879 : Card() {
    override val id = 13879
    override val name = "鱼人宝宝"
    override val description = ""
    override var cost: Int? = null
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "鱼人宝宝实在是太可爱了，以至于谁见了都想抱一抱，结果因窒息所导致的死亡率极高。"
    override val artist = "Oliver Chipping"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6dd7cdba66eb2b72dc5df0b40c9c46ab005eba49ee08ff3a05fdc1707fcb29f9.png"
}

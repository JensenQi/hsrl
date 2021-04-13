package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KaraKazham_39197 : Card() {
    override val id = 39197
    override val name = "附灵术"
    override val description = "召唤一个1/1的蜡烛，2/2的扫帚和3/3的茶壶。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Karazhan
    override val background = "瞧见没，这就是让卡德加去布置餐桌的后果。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ee37170b13224a0cc02061e2b478c05153978c5885a8b7e54dfc81ad1d16944.png"
}

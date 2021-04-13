package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EagerUnderling_52482 : Card() {
    override val id = 52482
    override val name = "性急的杂兵"
    override val description = "<b>亡语：</b>随机使两个友方随从获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "不惜性命也要急着强化大家。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e2198c9d4757e45f1d5e865f2940c3bd699212abd34b3b7c94865d521fb0d5c.png"
}

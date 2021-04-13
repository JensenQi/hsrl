package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThunderBluffValiant_2615 : Card() {
    override val id = 2615
    override val name = "雷霆崖勇士"
    override val description = "<b>激励：</b>使你的图腾获得+2攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "用图腾做武器并不算犯规。至少赛事规则里没提到过这点。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/912c3c3251fc91557da98a5bb402f436d68018d82494d05f79a7d1d0fc4a3b66.png"
}

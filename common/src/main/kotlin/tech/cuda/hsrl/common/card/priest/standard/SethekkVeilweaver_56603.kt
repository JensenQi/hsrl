package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SethekkVeilweaver_56603 : Card() {
    override val id = 56603
    override val name = "塞泰克织巢者"
    override val description = "在你对一个随从施放法术后，随机将一张牧师法术牌置入你的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "塞泰克鸦人善于利用他们的力量，还有浮夸的大帽子。否则也存活不了这么久。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/46646c3c38d5190226f2a41c8cce9c579a512b9de35ea480dc33acdb2659e529.png"
}

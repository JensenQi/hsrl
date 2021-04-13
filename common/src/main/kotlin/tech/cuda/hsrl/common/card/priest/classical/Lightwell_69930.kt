package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightwell_69930 : Card() {
    override val id = 69930
    override val name = "光明之泉"
    override val description = "在你的回合开始时，随机为一个受伤的 友方角色恢复 3点生命值。"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "以前有很多牧师都不明白，究竟是因为队友看不见光明之泉呢，还是他们故意不想点它呢？"
    override val artist = "Blizzard Entertainment"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c18331010c8043c1a2f781dc1461496e208eb663a7cd1c12a49ed3198f903e6f.png"
}

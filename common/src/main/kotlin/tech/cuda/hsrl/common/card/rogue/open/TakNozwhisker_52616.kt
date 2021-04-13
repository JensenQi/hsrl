package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TakNozwhisker_52616 : Card() {
    override val id = 52616
    override val name = "塔克·诺兹维克"
    override val description = "每当你将一张牌洗入你的牌库时，将该牌的一张复制置入你的 手牌。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“这个是我的，那个还是我的！”"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/67ab34248a1843fa42a1d4bd06205cb4c9fc9305a1395cc3b97d6f831eac584a.png"
}

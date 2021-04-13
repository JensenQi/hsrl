package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GadgetzanAuctioneer_69844 : Card() {
    override val id = 69844
    override val name = "加基森拍卖师"
    override val description = "每当你施放一个法术，抽一张牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他曾经经营过黑市的拍卖行，但是那里的暴力冲突太多了，他只好被迫离开。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b20ae8f255c20876dd1e596ed6d6f9bc89b1aebccfb46e98de3d546c5e93e2d7.png"
}

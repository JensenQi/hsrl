package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GadgetzanAuctioneer_932 : Card() {
    override val id = 932
    override val name = "加基森拍卖师"
    override val description = "每当你施放一个法术，抽一张牌。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他曾经经营过黑市的拍卖行，但是那里的暴力冲突太多了，他只好被迫离开。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bca7e4c3e6469b3a7fae5d663f5870c78f21a3b49638378cc41794fbea1b8f9d.png"
}

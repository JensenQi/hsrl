package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GadgetzanAuctioneer_69664 : Card() {
    override val id = 69664
    override val name = "加基森拍卖师"
    override val description = "每当你施放一个法术，抽一张牌。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "他曾经经营过黑市的拍卖行，但是那里的暴力冲突太多了，他只好被迫离开。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd1319ea545e9907f667906e288530c5d1cdaaa0815b38baeef49f7474717344.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AuctionmasterBeardo_40605 : Card() {
    override val id = 40605
    override val name = "大富翁比尔杜"
    override val description = "在你施放一个法术后，复原你的 英雄技能。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "加基森的地下拍卖行随着城市的迅猛发展，生意越做越大。比尔杜挣钱后开始涉足房地产行业，并一跃成为加基森数一数二的大富豪。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58816ed4cb300c33bf7dca56e493795d10099c636595706c8187f151f89cef42.png"
}

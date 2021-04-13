package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTastyfin_50402 : Card() {
    override val id = 50402
    override val name = "鱼人大厨"
    override val description = "<b>亡语：</b>从你的牌库中抽两张鱼人牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "这道汤品可少不了它。随你怎么理解了……"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/739600b99fbf5f8e6a3d3d645b6b1c4e0eb17756708783bdc7b8714a2f0d31d2.png"
}

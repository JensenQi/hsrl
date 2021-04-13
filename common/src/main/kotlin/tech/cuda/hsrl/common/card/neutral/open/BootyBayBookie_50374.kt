package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BootyBayBookie_50374 : Card() {
    override val id = 50374
    override val name = "藏宝海湾荷官"
    override val description = "<b>战吼：</b>使你的对手获得一个幸运币。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "古拉巴什首家竞技场上线了！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/019df1934c27717bb573a2005ea1c80e9ceaa00700d13af28cabdcf755baab08.png"
}

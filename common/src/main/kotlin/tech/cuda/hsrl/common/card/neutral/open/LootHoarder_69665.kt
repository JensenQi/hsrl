package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LootHoarder_69665 : Card() {
    override val id = 69665
    override val name = "战利品贮藏者"
    override val description = "<b>亡语：</b>抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "全都点需求。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ac5939d1b982b18e3dccfea68c0319dabe4be671a9f83dd9ec697ce013a7d32.png"
}

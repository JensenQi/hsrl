package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VentureCoMercenary_1122 : Card() {
    override val id = 1122
    override val name = "风险投资公司雇佣兵"
    override val description = "你的随从牌的法力值消耗增加（3）点。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "有钱能使鬼推磨。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bde3341910e59b4e5b0620ec032bceefd3507e7e8ea99ed39d6f68662363f35f.png"
}

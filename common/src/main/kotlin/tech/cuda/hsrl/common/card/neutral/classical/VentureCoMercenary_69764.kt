package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VentureCoMercenary_69764 : Card() {
    override val id = 69764
    override val name = "风险投资公司雇佣兵"
    override val description = "你的随从牌的法力值消耗增加（3）点。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "有钱能使鬼推磨。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d58326525a213641cb16ca6b3ed0af4648c4ded83645874c013c32c09172980.png"
}

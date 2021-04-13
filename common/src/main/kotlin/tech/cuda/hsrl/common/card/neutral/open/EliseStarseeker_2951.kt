package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EliseStarseeker_2951 : Card() {
    override val id = 2951
    override val name = "伊莉斯·逐星"
    override val description = "<b>战吼：</b>将“黄金猿藏宝图”洗入你的牌库。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "作为团队里的绘图师，伊莉斯现在最主要的工作就是拼凑出完整的“黄金猿藏宝图”。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/935cd6d2218842cd211163e62fda44e2a29d73e1e6536bbcceb4f9e25fbb4824.png"
}

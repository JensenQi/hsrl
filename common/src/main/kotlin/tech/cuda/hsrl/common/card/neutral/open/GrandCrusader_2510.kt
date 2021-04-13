package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrandCrusader_2510 : Card() {
    override val id = 2510
    override val name = "十字军统领"
    override val description = "<b>战吼：</b> 随机将一张圣骑士牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "她是一名久经沙场的十字军统领，代表了正义和信仰。她上一次的征讨对象是地精电话推销员。"
    override val artist = "Todd Lockwood"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd5e4b085c10f869639cc09290d4e75be2730315fbbf8c8eab0ecc19fa633df1.png"
}

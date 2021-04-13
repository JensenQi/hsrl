package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RefreshmentVendor_2704 : Card() {
    override val id = 2704
    override val name = "零食商贩"
    override val description = "<b>战吼：</b>为每个英雄恢复 4点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "这里有漏斗蛋糕，有胡萝卜，有爆米花，还有多汁肉排。所有种族齐聚一堂，可谓众口难调。"
    override val artist = "Ron Spears"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e2fb32126439ae462c2de40e57cc5a08c2446f3f0805df1e6093b4f21103914.png"
}

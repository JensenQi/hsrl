package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchivistElysiana_52870 : Card() {
    override val id = 52870
    override val name = "档案员艾丽西娜"
    override val description = "<b>战吼：</b><b>发现</b>五张卡牌，将你牌库里的所有卡牌替换成每张卡牌的两张复制。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "整理你的牌库对她而言不算什么。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1c7c43e066b72e3a7c0fe99dce794fafb8a6f53410488ca4e38494c90b28fb8.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HumongousRazorleaf_69728 : Card() {
    override val id = 69728
    override val name = "巨齿刀叶"
    override val description = "无法攻击。"
    override var cost: Int? = 3
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "最爱吃地精。鸡肉味，嘎嘣脆！"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b5a0522fbaa73d7db12e8b8c04a9401db9965bf7aa06e01dc14c7bd23789944.png"
}

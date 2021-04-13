package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HumongousRazorleaf_41925 : Card() {
    override val id = 41925
    override val name = "巨齿刀叶"
    override val description = "无法攻击。"
    override var cost: Int? = 3
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "最爱吃地精。鸡肉味，嘎嘣脆！"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a5491b65a73036e6850f9f46b8fc0043b18d5b645a974dacedb2a36da18f4a8.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MiniMage_69719 : Card() {
    override val id = 69719
    override val name = "小个子法师"
    override val description = "<b>潜行，法术伤害+1</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "有时候你能够在古拉巴什竞技场的宝箱中发现他。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/11244076582ac834eb373d66e48cc780b73a6e3e960a102cff7e13453e8d4a1f.png"
}

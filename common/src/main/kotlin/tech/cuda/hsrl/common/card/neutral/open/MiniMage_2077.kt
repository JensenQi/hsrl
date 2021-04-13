package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MiniMage_2077 : Card() {
    override val id = 2077
    override val name = "小个子法师"
    override val description = "<b>潜行，法术伤害+1</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "有时候你能够在古拉巴什竞技场的宝箱中发现他。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f9ac4bd696458f58e7c730efc23b633fbe075577ad9690100ae0dc30a939b204.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TolvirStoneshaper_41241 : Card() {
    override val id = 41241
    override val name = "托维尔塑石师"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他为了保持这副身材，花了大把的时间在塑形。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2bf8d3daac840207c064d40bb64f1c5c3d8ea8f2b8301d6a393caeda040599cd.png"
}

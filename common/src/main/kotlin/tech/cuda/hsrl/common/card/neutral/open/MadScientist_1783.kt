package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadScientist_1783 : Card() {
    override val id = 1783
    override val name = "疯狂的科学家"
    override val description = "<b>亡语：</b> 将一个<b>奥秘</b>从你的牌库中置入战场。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "他的妈妈希望他成为一名法师或是一名术士，但是他没有。他必须踏上属于自己的道路，成为一个和他父亲一样的科学家。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f49a5a8dc1cd2866d3560bb9f4fc81c17855dbba1e386cf3e0144b381cfbcde3.png"
}

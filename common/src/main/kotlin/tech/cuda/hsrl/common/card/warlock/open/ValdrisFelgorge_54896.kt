package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ValdrisFelgorge_54896 : Card() {
    override val id = 54896
    override val name = "瓦迪瑞斯·邪噬"
    override val description = "<b>战吼：</b>将你的手牌上限提高至12张。抽四张牌。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "不是我八卦，你的两只手不会刚好都有六根手指吧？"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1a7e6fc715a70e360ea00b70f6f438d58cb589661e56054f7c9a984a433c785.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientWatcher_605 : Card() {
    override val id = 605
    override val name = "上古看守者"
    override val description = "无法攻击。"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "为什么在你走动的时候，会感觉它的眼珠也在跟着你动？"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e011982165dddb59d51c517e3b91f42afd5d7c7848ca4def660e71a4e543c5c.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HoodedAcolyte_39033 : Card() {
    override val id = 39033
    override val name = "兜帽侍僧"
    override val description = "每当一个角色获得治疗时，使你的克苏恩 获得+1/+1<i>（无论它在哪里）。</i>"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "你见过不带兜帽的侍僧吗？反正我没见过……"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4005a34c6f544d200ce8f7896a4e3dcfefa138a66bb614fcd911cc9c107e31d0.png"
}

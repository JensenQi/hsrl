package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostElemental_69906 : Card() {
    override val id = 69906
    override val name = "冰霜元素"
    override val description = "<b>战吼：</b> <b>冻结</b>一个角色。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "当水元素和冰元素相爱到一定程度的时候..."
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/54209a61baffb410b72d8fb42eeb4c3f17f12029f3eea984c59317d4f94f31c7.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostElemental_512 : Card() {
    override val id = 512
    override val name = "冰霜元素"
    override val description = "<b>战吼：</b> <b>冻结</b>一个角色。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "当水元素和冰元素相爱到一定程度的时候..."
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/121fcaca665fada49986ba0a1172990581b162a967e6801ccdef1e21f4eb4ed6.png"
}

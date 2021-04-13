package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavasaurRunt_41137 : Card() {
    override val id = 41137
    override val name = "暴掠龙幼崽"
    override val description = "<b>战吼：</b>如果你控制至少两个其他随从，便获得<b>进化</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "并不是很想进化，除非边上有人看着…至少两个。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1f74e22b8c4e0bbb68192acea22a991a357b2b2f4b8ce1b520f72e549f0a18c.png"
}

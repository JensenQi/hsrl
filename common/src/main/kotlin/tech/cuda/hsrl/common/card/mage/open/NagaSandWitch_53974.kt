package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NagaSandWitch_53974 : Card() {
    override val id = 53974
    override val name = "纳迦沙漠女巫"
    override val description = "<b>战吼：</b>使你手牌中的法术牌法力值消耗变为（5）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "免费提高到5点法力值，想试试吗？"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2804a6979ce17947a552f09800513d4769a5fc60034dc2c3dd53161c25a0175f.png"
}

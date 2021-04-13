package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverHandKnight_69 : Card() {
    override val id = 69
    override val name = "白银之手骑士"
    override val description = "<b>战吼：</b>召唤一个2/2的侍从。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "做一名骑士很威风，但是做骑士的侍从感觉就差一点了。"
    override val artist = "Matt Starbuck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ceb7925dcd84fd0a0833a91054bd68f3fea49ae554f8506414c1b184547ce71a.png"
}

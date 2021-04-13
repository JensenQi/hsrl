package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverHandKnight_69756 : Card() {
    override val id = 69756
    override val name = "白银之手骑士"
    override val description = "<b>战吼：</b>召唤一个2/2的侍从。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "做一名骑士很威风，但是做骑士的侍从感觉就差一点了。"
    override val artist = "Matt Starbuck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bedbafb2c8847ae44a953fb8c142c98dbe369643cb73972645b766a3f1353438.png"
}

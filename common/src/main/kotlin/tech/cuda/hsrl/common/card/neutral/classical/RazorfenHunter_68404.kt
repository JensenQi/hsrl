package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazorfenHunter_68404 : Card() {
    override val id = 68404
    override val name = "剃刀猎手"
    override val description = "<b>战吼：</b>召唤一个1/1的野猪。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "有人曾经把塔丝克惹毛过一次。就一次。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d2ffd9fc9043d707c0cd1d7ddacc3169be3601dc2c0ad64eba7c8f79fd1b5b0.png"
}

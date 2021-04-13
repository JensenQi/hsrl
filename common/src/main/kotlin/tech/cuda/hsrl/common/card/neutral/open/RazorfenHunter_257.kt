package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazorfenHunter_257 : Card() {
    override val id = 257
    override val name = "剃刀猎手"
    override val description = "<b>战吼：</b>召唤一个1/1的野猪。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "有人曾经把塔丝克惹毛过一次。就一次。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ecadd709f9a9618b4cfb700210b5f142aba4b5d2a7c5e22100400c9b902b908.png"
}

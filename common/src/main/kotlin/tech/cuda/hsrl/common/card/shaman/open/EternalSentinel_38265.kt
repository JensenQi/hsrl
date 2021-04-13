package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EternalSentinel_38265 : Card() {
    override val id = 38265
    override val name = "永恒哨卫"
    override val description = "<b>战吼：</b>将你所有<b>过载</b>的法力水晶解锁。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "即便长了这么多眼睛，走起路来还是会撞到人。"
    override val artist = "J. Meyers & Nutchapol "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a64c53b5634e16fe13a0951cf611bebb6cbf97481f554ffe6570f393179b715.png"
}

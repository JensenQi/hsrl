package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkArakkoa_38882 : Card() {
    override val id = 38882
    override val name = "黑暗鸦人"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>使你的克苏恩获得+3/+3<i>（无论它在哪里）。</i>"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "黑夜给了它黑色的眼睛，它却用来寻找古神。"
    override val artist = "Nutchapol Thitinunthakorn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5bc98d39858c31480bb8fa13438d18dbe9c67c370adaba7386223ee41d7e5705.png"
}

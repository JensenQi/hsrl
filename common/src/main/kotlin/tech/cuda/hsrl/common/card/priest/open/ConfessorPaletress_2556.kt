package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConfessorPaletress_2556 : Card() {
    override val id = 2556
    override val name = "银色神官帕尔崔丝"
    override val description = "<b>激励：</b>随机召唤一个<b>传说</b>随从。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "她能知晓你的过往，并迫使你去直面内心深处的恐惧。一般而言最大众化的恐惧便是：斯尼德的伐木机里蹦出来一个克尔苏加德。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b5191a261dbd1b8cbad518e68e643ce732ad7c2d92965a58b12dd024a647c5b2.png"
}

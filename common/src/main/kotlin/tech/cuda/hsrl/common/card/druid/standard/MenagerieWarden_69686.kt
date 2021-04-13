package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MenagerieWarden_69686 : Card() {
    override val id = 69686
    override val name = "展览馆守卫"
    override val description = "<b>战吼：</b>选择一个友方野兽，召唤一个它的复制。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "当太阳最后的光芒消失在地平线上后，展览馆的一切都活了过来，就如同被施了魔法般活灵活现地围绕在她身旁。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6989f7918654dc1f4460487977d4bedcb0a7239a512b2db59927b3bd336f02f.png"
}

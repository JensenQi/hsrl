package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FreshScent_56067 : Card() {
    override val id = 56067
    override val name = "新鲜气息"
    override val description = "<b>双生法术</b> 使一个野兽获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "*嗅，嗅*是王牌部队……*嗅，嗅*武装到了牙齿……*嗅，嗅*牙缝里还有培根！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c27362c30cf3da3aa9e00cb437139bc230e6c670c1db474839c115c3b8dc6f9.png"
}

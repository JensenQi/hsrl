package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DoctorKrastinov_59690 : Card() {
    override val id = 59690
    override val name = "卡斯迪诺夫教授"
    override val description = "<b>突袭</b> 每当该随从攻击时，使你的武器获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "给我刀！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4bd9d347f2588420cb10af02558951feac9a4e015a92dfc136996f690f4dbc85.png"
}

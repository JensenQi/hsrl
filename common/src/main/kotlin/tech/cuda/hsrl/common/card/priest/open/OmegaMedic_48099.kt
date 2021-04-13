package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OmegaMedic_48099 : Card() {
    override val id = 48099
    override val name = "欧米茄医护兵"
    override val description = "<b>战吼：</b>如果你有十个法力水晶，为你的英雄恢复 10点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她认为等久一点你才会更感激她的治疗。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e86b33b8734bc6540a86d75b6c061d27c1a1f33294574f2dd1f857c6a01a8dd.png"
}

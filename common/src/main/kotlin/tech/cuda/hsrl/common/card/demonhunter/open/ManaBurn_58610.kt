package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaBurn_58610 : Card() {
    override val id = 58610
    override val name = "法力燃烧"
    override val description = "下个回合，你的对手减少两个法力水晶。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "确保让他们走向死路的方式之一。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/761897502aa6d4004d78aa6f6ef0a79210d0dae1f6ddbd8583719f7d93039360.png"
}

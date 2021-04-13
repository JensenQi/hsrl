package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritClaws_39694 : Card() {
    override val id = 39694
    override val name = "幽灵之爪"
    override val description = "当你拥有<b>法术伤害</b>时，获得 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Karazhan
    override val background = "比起那些钢爪骨爪，幽灵之爪伸出来时一点都不疼。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c277b4b7e430e2036b9a99f761a76032707fc76fed520b6a07f06731ab20e931.png"
}

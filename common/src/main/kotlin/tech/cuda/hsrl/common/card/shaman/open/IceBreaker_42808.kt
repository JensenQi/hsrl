package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceBreaker_42808 : Card() {
    override val id = 42808
    override val name = "破冰斧"
    override val description = "消灭所有受到该武器伤害的被<b>冻结</b>的随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "其实这把斧头也是冰做的。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c77cdd1fd1dc036df56a8465d427d1ded9d1a9e0adc480987d4133c5d01b8769.png"
}

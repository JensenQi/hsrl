package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RockbiterWeapon_69517 : Card() {
    override val id = 69517
    override val name = "石化武器"
    override val description = "在本回合中，使一个友方角色获得+3攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "如果你的敌人是石头做的，那就再好不过了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76a3ccc246999beb6f1db19f340e37a77e28787ecb623b81f52e89a5d98652f1.png"
}

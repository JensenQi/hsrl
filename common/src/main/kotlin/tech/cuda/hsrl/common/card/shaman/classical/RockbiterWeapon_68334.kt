package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RockbiterWeapon_68334 : Card() {
    override val id = 68334
    override val name = "石化武器"
    override val description = "在本回合中，使一个友方角色获得+3攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你的敌人是石头做的，那就再好不过了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b05f348928d17f6cd99805fa1c235e3ef2e0ffe805f165d0086031c04ffbf552.png"
}

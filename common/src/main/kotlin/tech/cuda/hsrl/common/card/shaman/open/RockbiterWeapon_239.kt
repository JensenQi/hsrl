package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RockbiterWeapon_239 : Card() {
    override val id = 239
    override val name = "石化武器"
    override val description = "在本回合中，使一个友方角色获得+3攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "如果你的敌人是石头做的，那就再好不过了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b8c418c8e99ba52926e8bfa472b2f6a9bd310f086a7f35fff1c7de1039d7255.png"
}

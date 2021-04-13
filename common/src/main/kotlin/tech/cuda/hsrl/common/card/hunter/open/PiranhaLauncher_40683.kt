package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PiranhaLauncher_40683 : Card() {
    override val id = 40683
    override val name = "食人鱼喷枪"
    override val description = "在你的英雄攻击后，召唤一个1/1的食人鱼。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "食人鱼当天的胃口决定了这把枪的威力大小。"
    override val artist = "Nick Southham"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0252e095dfd0a945ed1a5690e2db04332c09cef677259fba1a59ade6bcbe7c84.png"
}

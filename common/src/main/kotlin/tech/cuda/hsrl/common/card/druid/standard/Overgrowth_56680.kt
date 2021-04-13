package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Overgrowth_56680 : Card() {
    override val id = 56680
    override val name = "过度生长"
    override val description = "获得两个空的法力水晶。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "菌生我未生，我生菌已老。"
    override val artist = "Armand Serrano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eedf0c516b7aa639b681deecb6033bd29acba3532469270bb2e9d5fa73e086e8.png"
}

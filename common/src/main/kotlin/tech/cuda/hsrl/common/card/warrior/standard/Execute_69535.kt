package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Execute_69535 : Card() {
    override val id = 69535
    override val name = "斩杀"
    override val description = "消灭一个受伤的敌方随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "这没什么，他罪有应得。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a60efd2e367f433e8978b6b91d485ea9936be198387755923bf008530993562.png"
}

package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Execute_785 : Card() {
    override val id = 785
    override val name = "斩杀"
    override val description = "消灭一个受伤的敌方随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "这没什么，他罪有应得。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5ead191c1a45cd79fb1dd90864b6b19af06db5b253ab10914348200fddbe0fb3.png"
}

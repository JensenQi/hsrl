package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flamecannon_1927 : Card() {
    override val id = 1927
    override val name = "烈焰轰击"
    override val description = "随机对一个敌方随从造成 4点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "把某个法术称作为烈焰轰击并不能把它从根本上与其他地精装置的效果区别开来。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8e276efc42b7b0766c413624b8a4e8d674eecdfdf9ba4e58b6386f8ba085b3b.png"
}

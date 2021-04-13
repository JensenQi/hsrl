package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FiendishCircle_46864 : Card() {
    override val id = 46864
    override val name = "恶魔法阵"
    override val description = "召唤四个1/1的小鬼。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "从此告别三缺一的烦恼了。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a68a34d6f0c320b0611c8a75f034606ba9c7d97f69da64dbee6b0518f8a4dc10.png"
}

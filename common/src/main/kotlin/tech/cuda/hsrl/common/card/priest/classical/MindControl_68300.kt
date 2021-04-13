package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindControl_68300 : Card() {
    override val id = 68300
    override val name = "精神控制"
    override val description = "获得一个敌方随从的控制权。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "被称为“最有可能让你的对手捶地撞墙的法术。”"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9599459e2fccc88268936e9fa3f975f8d792054861357e2bdcd63d2a82568fd5.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindControl_8 : Card() {
    override val id = 8
    override val name = "精神控制"
    override val description = "获得一个敌方随从的控制权。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "被称为“最有可能让你的对手捶地撞墙的法术。”"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24c7df57b8168e81028eabcfdd76ce608a3d80577515167d5b67dd68fe3d764e.png"
}

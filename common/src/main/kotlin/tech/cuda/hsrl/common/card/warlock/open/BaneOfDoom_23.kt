package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaneOfDoom_23 : Card() {
    override val id = 23
    override val name = "末日灾祸"
    override val description = "对一个角色造成 2点伤害。如果“末日灾祸”消灭该角色，随机召唤一个恶魔。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "福无双至，祸不单行。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a9cd5557dc8b3dcc490534842c840e61b63f19f5657e1e188232a4657618a87c.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoldiersCaravan_63690 : Card() {
    override val id = 63690
    override val name = "士兵车队"
    override val description = "在你的回合开始时，召唤两个1/1的白银之手新兵。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "没时间解释了，快上车！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f609532cbf7dd8253c25308de15b1ad83549a932ff37dedb497112d4c1922a84.png"
}

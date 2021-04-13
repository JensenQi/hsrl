package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MicroMachine_2071 : Card() {
    override val id = 2071
    override val name = "微型战斗机甲"
    override val description = "在每个回合开始时，获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "它虽然体型不大，但它学习战斗的能力却非常惊人。"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbb1f2d2f5feb950bf2bad6f48bc0aa3d1417451b478a13517109aa68bec8ad8.png"
}

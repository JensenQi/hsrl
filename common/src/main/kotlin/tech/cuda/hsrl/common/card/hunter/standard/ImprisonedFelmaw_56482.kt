package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedFelmaw_56482 : Card() {
    override val id = 56482
    override val name = "被禁锢的魔喉"
    override val description = "<b>休眠</b>两回合。唤醒时，随机攻击一个 敌人。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "它不关心是谁弄醒了它，总之必须得有个人挨上几口。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30581aa0e07d4b47dfadd1527c87afbac7bb2484022b68fa5b1d1c104af89b04.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadBomber_69662 : Card() {
    override val id = 69662
    override val name = "疯狂投弹者"
    override val description = "<b>战吼：</b>造成3点伤害，随机分配到所有其他角色身上。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "其实他也不算是很疯狂，他只是应该在携带炸药的时候更加小心一点而已。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51006c8bee3a3c9032a6ca53f876356255e041f45c09b57bade244d95ef7d6a1.png"
}

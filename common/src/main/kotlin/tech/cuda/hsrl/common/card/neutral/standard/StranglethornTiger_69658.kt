package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StranglethornTiger_69658 : Card() {
    override val id = 69658
    override val name = "荆棘谷猛虎"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "这些美丽的大猫是荆棘谷一道亮丽的风景！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/11e38618457572f1d06cdcb7dc0686ff70ea54a9a0ea657a15430dda1147c2dd.png"
}

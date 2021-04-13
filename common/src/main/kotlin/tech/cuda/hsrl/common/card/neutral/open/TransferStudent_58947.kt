package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TransferStudent_58947 : Card() {
    override val id = 58947
    override val name = "转校生"
    override val description = "该随从会根据你当前的对战面板获得不同的效果。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "哦，想想你要去的地方！有许多战斗等你来打响！许多的面板等你探索。还有许多的梦展翅飞翔。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5a0c46df94855071e7a1eebfbc87b5328efd881c145a5898e10b363b7e4eb87.png"
}

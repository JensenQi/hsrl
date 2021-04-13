package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyFork_39822 : Card() {
    override val id = 39822
    override val name = "致命餐叉"
    override val description = "<b>亡语：</b>将一张3/2的武器牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Karazhan
    override val background = "餐叉既可以用来吃饭，也可以用来……消灭对手。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc55ebdd85316b80030584c2b3f8e3a01dbc1dd39c5bd6b927350aa968621de0.png"
}

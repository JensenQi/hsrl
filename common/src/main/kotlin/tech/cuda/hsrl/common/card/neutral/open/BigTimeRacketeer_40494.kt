package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigTimeRacketeer_40494 : Card() {
    override val id = 40494
    override val name = "犯罪高手"
    override val description = "<b>战吼：</b>召唤一个6/6的食人魔。"
    override var cost: Int? = 6
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "快把宝贝交出来，不然我的“小伙伴”会揍扁你！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c5379a3ce8717662f5cce41ca838e2496a5e19cc0059c98486ef705635f07bc.png"
}

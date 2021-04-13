package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OnyxBishop_39374 : Card() {
    override val id = 39374
    override val name = "玛瑙主教"
    override val description = "<b>战吼：</b>召唤一个在本局对战中死亡的友方随从。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Karazhan
    override val background = "人生如棋，落子无悔。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee9eb50fc8fff8a40e3accf3c8cc93b8c2fe83eda01d46165209e7143f9cf26c.png"
}

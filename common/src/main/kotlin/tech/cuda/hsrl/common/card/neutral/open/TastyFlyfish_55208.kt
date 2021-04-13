package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TastyFlyfish_55208 : Card() {
    override val id = 55208
    override val name = "美味飞鱼"
    override val description = "<b>亡语：</b>使你手牌中的一张龙牌获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "富含维生素以及鱼人风味。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ffa1b01a6319f2925b95ab36579710f7311d835cce20baf9fe6b404679a8ed81.png"
}

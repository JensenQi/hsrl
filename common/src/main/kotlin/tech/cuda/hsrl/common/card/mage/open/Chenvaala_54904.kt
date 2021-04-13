package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Chenvaala_54904 : Card() {
    override val id = 54904
    override val name = "齐恩瓦拉"
    override val description = "你在一回合中施放三个法术后，召唤一个5/5的元素。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "和巨龙之魂有点像——如果巨龙有这种冷冰冰的灵魂。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ebf040c2d9d380b23d477f71db91008b2e7ef43f3f8b80c1f83cb1e8d8e07a7e.png"
}

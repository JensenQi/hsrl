package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Resurrect_2298 : Card() {
    override val id = 2298
    override val name = "复活术"
    override val description = "随机召唤一个在本局对战中死亡的友方随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Brm
    override val background = "我走进了幽暗的地下城，发现了一具冒险者的尸体。在他生命中最后的时刻，他在身边满是灰尘的墙上划出了两个数字：“99”。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3341f6e99b2ecd1e8038556235201ed1b0fabda5a616618cb737d1ef304e200c.png"
}

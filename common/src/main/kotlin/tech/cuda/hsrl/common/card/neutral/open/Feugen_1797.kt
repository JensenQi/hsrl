package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Feugen_1797 : Card() {
    override val id = 1797
    override val name = "费尔根"
    override val description = "<b>亡语：</b>如果斯塔拉格也在本局对战中死亡，召唤塔迪乌斯。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "费尔根很悲伤，因为所有人都喜欢斯塔拉格。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68adbc0e4081996c2a96401ff68e5d89232b9de4f5b145297def70cbc6a7cc1e.png"
}

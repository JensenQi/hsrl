package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PhantomFreebooter_42327 : Card() {
    override val id = 42327
    override val name = "幻影海盗"
    override val description = "<b>战吼：</b> 获得等同于你的武器属性的属性值。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "虽说是幻影，但她手上的武器可是货真价实！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d57da952e42841d47f31b1e86be3b4aabaa510ffe5d4e8ae6ece07e947d013e4.png"
}

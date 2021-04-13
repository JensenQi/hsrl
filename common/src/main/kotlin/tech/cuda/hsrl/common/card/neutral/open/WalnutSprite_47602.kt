package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WalnutSprite_47602 : Card() {
    override val id = 47602
    override val name = "胡桃精"
    override val description = "<b>回响</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "怎么让胡桃精笑呢？砸开它！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/803c1eb1ba2d5f952a671dc83da59fde90ef328b0546fe4b44009d32278fc9ce.png"
}

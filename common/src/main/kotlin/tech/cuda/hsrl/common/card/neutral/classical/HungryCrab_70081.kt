package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HungryCrab_70081 : Card() {
    override val id = 70081
    override val name = "鱼人杀手蟹"
    override val description = "<b>战吼：</b>消灭一个鱼人，并获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "又是鱼人。开饭了。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/121019dfdc9000f0eb9d4cebf7288b560b9c48f670e1b93bd8d067b1dbcab649.png"
}

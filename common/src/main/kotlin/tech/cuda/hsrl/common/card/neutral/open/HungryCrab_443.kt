package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HungryCrab_443 : Card() {
    override val id = 443
    override val name = "鱼人杀手蟹"
    override val description = "<b>战吼：</b>消灭一个鱼人，并获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "又是鱼人。开饭了。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/017ba931ad34315340ae745fb5f187381f8aa08371b4a9ffb2e5104b7dbfa673.png"
}

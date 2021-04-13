package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Murmy_54730 : Card() {
    override val id = 54730
    override val name = "鱼人木乃伊"
    override val description = "<b>复生</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "与其他木乃伊不同，人们把他和米饭、黄瓜条卷在了一起，还刷了一点酱油。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/90a586f4d9e04b2cc86f1e6c6914ab0f6fceed1e4f40f63615bc16e17541fce9.png"
}

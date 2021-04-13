package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ysera_70980 : Card() {
    override val id = 70980
    override val name = "伊瑟拉"
    override val description = "在你的回合结束时，将一张梦境牌置入你的手牌。"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "伊瑟拉统治翡翠梦境。所谓翡翠梦境，究竟只是现实世界的绿色朦胧倒影，还是其他别的什么地方？"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6418d049a5a786516f3b56a0fe3c11cad4697f0c7aed73474678d34484d79a93.png"
}

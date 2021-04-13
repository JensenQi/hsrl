package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ysera_1186 : Card() {
    override val id = 1186
    override val name = "伊瑟拉"
    override val description = "在你的回合结束时，将一张梦境牌置入你的手牌。"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "伊瑟拉统治翡翠梦境。所谓翡翠梦境，究竟只是现实世界的绿色朦胧倒影，还是其他别的什么地方？"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5dd44e9d5adffe0b185d83413b243f495460458ddd95ef1245b054c27f6bd7b4.png"
}

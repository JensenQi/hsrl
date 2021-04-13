package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EerieStatue_9107 : Card() {
    override val id = 9107
    override val name = "诡异的雕像"
    override val description = "除非它是战场上唯一的一个随从，否则无法进行攻击。"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "不要东张西望！一旦引起它的注意，你就自求多福吧。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c02593802dce201fa6542ba8797a3c638e465a9de2c89fec8c1e92ffe7ffd93.png"
}

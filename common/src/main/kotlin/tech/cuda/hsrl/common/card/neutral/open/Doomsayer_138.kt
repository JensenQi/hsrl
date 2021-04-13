package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomsayer_138 : Card() {
    override val id = 138
    override val name = "末日预言者"
    override val description = "在你的回合开始时，消灭所有随从。"
    override var cost: Int? = 2
    override var health: Int? = 7
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他的预言几乎都是准确的。他确信，大约会是在《大地的裂变》。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cac5f68813004f75c431032b7d68287a292897627ee93edb36ec6f474a035d4e.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gyrocopter_55406 : Card() {
    override val id = 55406
    override val name = "旋翼机"
    override val description = "<b>突袭，风怒</b>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "照例必须在起飞前进行精确的调校。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b335bd8ec6de7335b7b55ed7d5edec6c8bb3e9b0745fa43a8af2018928d48e2f.png"
}

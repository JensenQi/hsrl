package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyShot_70056 : Card() {
    override val id = 70056
    override val name = "致命射击"
    override val description = "随机消灭一个敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "我们的弩炮手效率很高，但准度就……"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b56cb94b39b593e21d07b0fb582b3e2d9cdb1cfdac1ab9ff9cde6b329660ba8a.png"
}

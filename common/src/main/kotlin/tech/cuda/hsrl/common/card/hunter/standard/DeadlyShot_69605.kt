package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyShot_69605 : Card() {
    override val id = 69605
    override val name = "致命射击"
    override val description = "随机消灭一个敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "我们的弩炮手效率很高，但准度就……"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7387d65688d1d4e0e668734b2b6ffcaf8885e12b7e5c4c7ee5fe2c76be43c2ec.png"
}

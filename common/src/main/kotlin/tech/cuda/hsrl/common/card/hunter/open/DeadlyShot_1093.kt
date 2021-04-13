package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyShot_1093 : Card() {
    override val id = 1093
    override val name = "致命射击"
    override val description = "随机消灭一个敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "我们的弩炮手效率很高，但准度就……"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aac1b05d7b0c25b48f39c0f88d473b69c18db3d8c77e022c79f764ded341026e.png"
}

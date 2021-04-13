package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WastelandAssassin_54000 : Card() {
    override val id = 54000
    override val name = "废土刺客"
    override val description = "<b>潜行，复生</b>"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "即便我的身体，眼睛和匕首都在发光，他们也不会发现我的到来。"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c77c0b87b066a5f05cd7a7983d6f3fc594f04fe4bf320ab2d2615ef33bbe0f84.png"
}

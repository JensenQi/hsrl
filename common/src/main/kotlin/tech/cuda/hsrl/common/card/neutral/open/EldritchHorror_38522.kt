package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EldritchHorror_38522 : Card() {
    override val id = 38522
    override val name = "惊骇恐魔"
    override val description = ""
    override var cost: Int? = 8
    override var health: Int? = 10
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "长得丑并不是它的错，但是出来吓人就是它的不对了。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5aa67de0e92b78257a71420aef9d925c1348a23406fb59b2a2ddc41c03aa8afe.png"
}

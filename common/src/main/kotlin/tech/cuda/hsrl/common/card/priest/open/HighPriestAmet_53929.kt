package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighPriestAmet_53929 : Card() {
    override val id = 53929
    override val name = "高阶祭司阿门特"
    override val description = "每当你召唤一个随从，将其生命值设置为与本随从相同。"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "众生平等。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad7cbe1d96fa9a5066c47266df41497c2604b5260be590ad634196ad891cb76e.png"
}

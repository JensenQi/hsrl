package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneAnomaly_39215 : Card() {
    override val id = 39215
    override val name = "奥术畸体"
    override val description = "在你施放一个法术后，该随从便获得 +1生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "他原本是一个时空畸体，在厌倦了两极颠倒的生活后变成了现在这个模样。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1cd2524116bde4c7f2af2668a5b4af9dba3f100de8c741378c49b7f2d15c02d5.png"
}

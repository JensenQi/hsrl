package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FurnacefireColossus_42779 : Card() {
    override val id = 42779
    override val name = "熔火巨像"
    override val description = "<b>战吼：</b>弃掉你手牌中所有的武器牌，并获得这些武器的属性值。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "只熔在口，不熔在手。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/015b74d21d167cb768df3258dbc7a4f841fa5e9a82621a7ad95e98c310eac9ce.png"
}

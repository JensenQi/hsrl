package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HotAirBalloon_55402 : Card() {
    override val id = 55402
    override val name = "热气球"
    override val description = "在你的回合开始时，获得+1生命值。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "今年加基森的感恩节巡游里少了一只热气球。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/40f6cd42d06e9a2933b03413ee536640b1694e92d6f7df6c60516f6f35cbb24b.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Deathspeaker_42394 : Card() {
    override val id = 42394
    override val name = "亡语者"
    override val description = "<b>战吼：</b>在本回合中，使一个友方随从获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "虫之将死，其声也亮。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e5e732ad3996dc7d0472c5995e2dc8f040472856f8d3d910945181ddb45cd18.png"
}

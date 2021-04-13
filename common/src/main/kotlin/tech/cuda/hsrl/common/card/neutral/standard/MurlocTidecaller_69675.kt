package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTidecaller_69675 : Card() {
    override val id = 69675
    override val name = "鱼人招潮者"
    override val description = "每当你召唤一个鱼人，便获得 +1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "每当他和他的家人团聚时，这个家伙会变得特别厉害。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3749ed89cb6b7ca52a1f919628fe2a42d0d89bcbd92a01fa176fc545a8ae7340.png"
}

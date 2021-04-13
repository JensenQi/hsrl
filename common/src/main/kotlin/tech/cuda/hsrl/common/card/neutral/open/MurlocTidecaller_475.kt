package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTidecaller_475 : Card() {
    override val id = 475
    override val name = "鱼人招潮者"
    override val description = "每当你召唤一个鱼人，便获得 +1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "每当他和他的家人团聚时，这个家伙会变得特别厉害。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bff3f05a9f1e131f444d3778ac5f0f4a94e74cd861e9722122e76e95936a8c3b.png"
}

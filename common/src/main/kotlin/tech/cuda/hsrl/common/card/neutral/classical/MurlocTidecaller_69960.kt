package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTidecaller_69960 : Card() {
    override val id = 69960
    override val name = "鱼人招潮者"
    override val description = "每当有玩家召唤一个鱼人，便获得 +1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "每当他和他的家人团聚时，这个家伙会变得特别厉害。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e12ddd3e90552ac30dd9ceb977f1454baa388b7772a5592b17e41005fbdac12e.png"
}

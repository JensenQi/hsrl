package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostwolfGrunt_68382 : Card() {
    override val id = 68382
    override val name = "霜狼步兵"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他的祖祖辈辈都是步兵，这已经不仅仅是一份工作而已了。"
    override val artist = "Richie Marella"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1c1314b32fb21a307015b989ea987112725286fc0ec76aea34f48a12067ca6b.png"
}

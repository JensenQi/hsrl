package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Landscaping_69685 : Card() {
    override val id = 69685
    override val name = "植树造林"
    override val description = "召唤两个2/2的树人。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "在我的后园，可以看见墙外有两株树，一株是树人，还有一株也是树人。"
    override val artist = "Sam Hogg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5593e984e531862a41da57b7bf48d408d5e5ce84b9f8d93d15e5ed50f8feb48.png"
}

package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Landscaping_48607 : Card() {
    override val id = 48607
    override val name = "植树造林"
    override val description = "召唤两个2/2的树人。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "在我的后园，可以看见墙外有两株树，一株是树人，还有一株也是树人。"
    override val artist = "Sam Hogg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd108f8b34806285f7e98eaa24f0c6e434fe5cdd14c59c7feb849991b9cdcdc7.png"
}

package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FiendishCircle_69734 : Card() {
    override val id = 69734
    override val name = "恶魔法阵"
    override val description = "召唤四个1/1的小鬼。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "从此告别三缺一的烦恼了。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8b31d29a6e04faea49499764446dcbd15faa0043d7ef37b6946a8eafa3015f06.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vanish_196 : Card() {
    override val id = 196
    override val name = "消失"
    override val description = "将所有随从移回其拥有者的 手牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy4
    override val background = ""
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d79fb38298dbdc87f8d30d949929068ca7de5974baa86008d4a449a1c159e79.png"
}

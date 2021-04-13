package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PursuitOfJustice_66862 : Card() {
    override val id = 66862
    override val name = "正义追击"
    override val description = "使你本局对战中召唤的白银之手新兵获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "“这究竟是正义，还是生意？”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/371a2f878bd05cb33b735403a71b6a31bf68168348fcddc09209be916e161aa9.png"
}

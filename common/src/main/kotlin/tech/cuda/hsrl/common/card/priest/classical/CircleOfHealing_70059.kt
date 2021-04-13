package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CircleOfHealing_70059 : Card() {
    override val id = 70059
    override val name = "治疗之环"
    override val description = "为所有随从恢复 4点生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "神圣的象征。"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9036ebb35861fbe471803c5cc71010670306ff07eb256e58a72d791b9c21a4f5.png"
}

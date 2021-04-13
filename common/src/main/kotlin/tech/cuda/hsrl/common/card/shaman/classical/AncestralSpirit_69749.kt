package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestralSpirit_69749 : Card() {
    override val id = 69749
    override val name = "先祖之魂"
    override val description = "选择一个随从。当该随从被消灭时，使其返回战场。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "只是伤到些皮毛而已。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/513a90b7cda421fb206def0096696f4f7f84e842ae50ab083cbfda770ea1cdda.png"
}

package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WindfuryHarpy_69823 : Card() {
    override val id = 69823
    override val name = "风怒鹰身人"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "鹰身人的声音非常...“令人不悦”。这是最好听的说法。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c31104835e365afc2a78f3c84c06391c8fbf49723e86644b1397b764e06407f.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WindfuryHarpy_567 : Card() {
    override val id = 567
    override val name = "风怒鹰身人"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "鹰身人的声音非常...“令人不悦”。这是最好听的说法。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1cf292c745f486c7399487a4e54cece13d1842fefa2ba6f13d2b9603ac9357e5.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelsoulInquisitor_46991 : Card() {
    override val id = 46991
    override val name = "邪魂审判官"
    override val description = "<b>嘲讽，吸血</b>"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "你可不想成为他口中所谓的异端。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f247f3edaab75ee76240e9c6b9e638fe8db4031a8276ff133e90350aebd05ad2.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DireMole_45707 : Card() {
    override val id = 45707
    override val name = "厄运鼹鼠"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "你肯定不想让厄运鼹鼠把洞穴挖的满山都是吧。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b10280b477c6023691ecc15f3afe3ed129583e5a0d582fa098ce7b5247c7af7.png"
}

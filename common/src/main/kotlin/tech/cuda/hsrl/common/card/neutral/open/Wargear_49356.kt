package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wargear_49356 : Card() {
    override val id = 49356
    override val name = "战争机兵"
    override val description = "<b>磁力</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "AMANI NAKUPENDA NAKUPENDA WE WE"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2f52b2fad13a0b338f88eadb8aedefacb5fb78f496bedde1a6d649e264f5b68.png"
}

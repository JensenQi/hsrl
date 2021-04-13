package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PatientAssassin_69961 : Card() {
    override val id = 69961
    override val name = "耐心的刺客"
    override val description = "<b>潜行</b>。消灭任何受到该随从伤害的随从。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "其实他的耐性并不好。只是等待他的目标靠近需要花点时间。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f0f83a55cdb9076b2b10fcb1fcf13dd0cdde5029d20d624fdd8f655be21808a.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PatientAssassin_1133 : Card() {
    override val id = 1133
    override val name = "耐心的刺客"
    override val description = "<b>潜行</b> <b>剧毒</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "其实他的耐性并不好。只是等待他的目标靠近需要花点时间。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3fd3c28a4d8d70ff278f3d8c8c828b4646c66919b3ac66b48306760ce858d14b.png"
}

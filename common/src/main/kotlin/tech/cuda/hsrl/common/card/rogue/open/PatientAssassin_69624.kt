package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PatientAssassin_69624 : Card() {
    override val id = 69624
    override val name = "耐心的刺客"
    override val description = "<b>潜行</b> <b>剧毒</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "其实他的耐性并不好。只是等待他的目标靠近需要花点时间。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d749748fdfebf9f4a6b04d3658f0f88d762868a129478bdfc32b05bbce8e4f3f.png"
}

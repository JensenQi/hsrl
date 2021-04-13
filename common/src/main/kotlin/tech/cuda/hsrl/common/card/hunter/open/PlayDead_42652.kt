package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlayDead_42652 : Card() {
    override val id = 42652
    override val name = "装死"
    override val description = "触发一个友方随从的<b>亡语</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "想做好演员，得先学会装死。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c43fb01294f6a5039f2ad38269a7bf3e0378f74111f2e57273a1da668ba1d31.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Redemption_140 : Card() {
    override val id = 140
    override val name = "救赎"
    override val description = "<b>奥秘：</b>当一个友方随从死亡时，使其回到战场，并具有1点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "救赎并非是从罪恶中得以解脱，而是对生活的彻底肯定，包括其中的痛苦、折磨和荒诞。"
    override val artist = "Ittoku"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e3580ef40666b1b67a6564126494f9d8cdf178a4d980d412e439822397413fd.png"
}

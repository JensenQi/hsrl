package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Redemption_69861 : Card() {
    override val id = 69861
    override val name = "救赎"
    override val description = "<b>奥秘：</b>当一个友方随从死亡时，使其回到战场，并具有1点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "救赎并非是从罪恶中得以解脱，而是对生活的彻底肯定，包括其中的痛苦、折磨和荒诞。"
    override val artist = "Ittoku"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/73530e35bb54a5c66618e23b75c0a07088ccff1a3145b36448873f5ec2064dbb.png"
}

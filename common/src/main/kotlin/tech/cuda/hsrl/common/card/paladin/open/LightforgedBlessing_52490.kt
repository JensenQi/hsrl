package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightforgedBlessing_52490 : Card() {
    override val id = 52490
    override val name = "光铸祝福"
    override val description = "<b>双生法术</b> 使一个友方随从获得<b>吸血</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "总有人写成光蛀祝福。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e187b2a08460b0760581720fc7867093e4eba4467030f3e8656c6cd9ad5212d5.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoundTheBells_46713 : Card() {
    override val id = 46713
    override val name = "敲响警钟"
    override val description = "<b>回响</b> 使一个随从获得+1/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "有趣的是，下午6点后你就听不到钟声了。"
    override val artist = "Milivoj Ceran"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7fc13034896ad93322e24d2611225575160cb3b5c64a423bab876c517ce0d69.png"
}

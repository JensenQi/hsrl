package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RafaamsScheme_51371 : Card() {
    override val id = 51371
    override val name = "拉法姆的阴谋"
    override val description = "召唤1个1/1的小鬼。<i>（每回合都会升级！）</i>"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“谋略不够……小鬼来凑。”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eac08e73b645e7fb0c19f22f91351d1677cd640ff2cffbd8d1840dc9395dd447.png"
}

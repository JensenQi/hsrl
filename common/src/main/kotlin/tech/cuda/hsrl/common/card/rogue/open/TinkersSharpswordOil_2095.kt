package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TinkersSharpswordOil_2095 : Card() {
    override val id = 2095
    override val name = "修补匠的磨刀油"
    override val description = "使你的武器获得+3攻击力。<b>连击：</b>随机使一个友方随从获得+3攻击力。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "工欲善其事，必先利其器。"
    override val artist = "Den"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5df639f58f3597ab3114f0520728844814a6a911a483ab4aca5e40ceca965c77.png"
}

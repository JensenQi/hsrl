package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ViciousScraphound_53104 : Card() {
    override val id = 53104
    override val name = "凶恶的废钢猎犬"
    override val description = "每当该随从造成伤害时，获得等量的 护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "听到废钢的声音就激动。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bfb4b8ebddc49de7840959bae348cada848e23f9ba2be04694b1f2ae0ef6f326.png"
}

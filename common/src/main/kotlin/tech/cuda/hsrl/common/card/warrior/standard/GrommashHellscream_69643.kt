package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrommashHellscream_69643 : Card() {
    override val id = 69643
    override val name = "格罗玛什·地狱咆哮"
    override val description = "<b>冲锋</b> 受伤时具有+6攻 击力。"
    override var cost: Int? = 8
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "灰谷南方，来自地狱的咆哮还在回响。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79a1c392fb15002dd5630d904ea7bef39ac91ca7846100b7aba8ec88ca32bad4.png"
}

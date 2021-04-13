package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrommashHellscream_338 : Card() {
    override val id = 338
    override val name = "格罗玛什·地狱咆哮"
    override val description = "<b>冲锋</b> 受伤时具有+6攻 击力。"
    override var cost: Int? = 8
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "灰谷南方，来自地狱的咆哮还在回响。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/577576c33326f34ccd89f778b1cf651135ec0b6e3f52c5439cdb74d6013e3003.png"
}

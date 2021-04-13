package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrommashHellscream_69958 : Card() {
    override val id = 69958
    override val name = "格罗玛什·地狱咆哮"
    override val description = "<b>冲锋</b> <b>激怒：</b>+6攻击力"
    override var cost: Int? = 8
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "灰谷南方，来自地狱的咆哮还在回响。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8881155359c4d766007279715ab2c3145da514709cf4963b681a121f099361b6.png"
}

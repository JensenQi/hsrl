package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HuntingMastiff_47930 : Card() {
    override val id = 47930
    override val name = "狩猎犬"
    override val description = "<b>回响，突袭</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "它的两位同伴一个叫汤瑞，一个叫杰姆。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/189a969859031ed0554e8f27840c6e86fba751c897df54724d30973c736e2c25.png"
}

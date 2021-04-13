package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shrinkmeister_1936 : Card() {
    override val id = 1936
    override val name = "缩小射线工程师"
    override val description = "<b>战吼：</b>在本回合中，使一个随从获得-2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "自从侏儒世界放大器被滥用之后，侏儒工程师们就对体型变化装置非常谨慎。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d1d69ab33f10a7b713b846e003fba68d1b552d8ae5ca7bc340aef0c4e0383862.png"
}

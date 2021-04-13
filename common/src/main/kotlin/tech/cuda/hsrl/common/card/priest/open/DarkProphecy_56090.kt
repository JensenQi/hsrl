package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkProphecy_56090 : Card() {
    override val id = 56090
    override val name = "黑暗预兆"
    override val description = "<b>发现</b>一张法力值消耗为（2）的随从牌。召唤该随从并使其获得+3生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "拉祖尔的预言总是那么黑暗。那些欢快又可爱的预言都去哪了？！"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f062ef4668af4949bcd5e1441926016cbc3843f35e73568017178254b90a39ff.png"
}

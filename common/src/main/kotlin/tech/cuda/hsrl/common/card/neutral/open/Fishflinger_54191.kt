package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Fishflinger_54191 : Card() {
    override val id = 54191
    override val name = "鱼人投手"
    override val description = "<b>战吼：</b>将一张随机鱼人牌分别置入每个玩家的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "黄绿鱼人去捕鱼，绿手抓着红鲤鱼。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ff28051e672840c98cca712a6e2ac02145be3264c98ba5488b6900f0012cff4.png"
}

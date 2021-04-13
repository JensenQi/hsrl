package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnvoyOfLazul_54887 : Card() {
    override val id = 54887
    override val name = "拉祖尔的信使"
    override val description = "<b>战吼：</b>检视三张卡牌。猜中来自你对手手牌中的卡牌，则获得该牌的一张复制。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“提醒自己：下次要附在一个认路的本地人身上。”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43858c60e840f0d438ba28f26f7e4c7c8517a181eedbd5ed1215b2d3255fffdd.png"
}

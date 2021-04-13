package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CuriousGlimmerroot_41177 : Card() {
    override val id = 41177
    override val name = "好奇的萤根草"
    override val description = "<b>战吼：</b>检视三张卡牌。猜中来自你对手套牌中的卡牌，则获得该牌的一张复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "好奇的不只有猫，还有萤根草。"
    override val artist = "Servando Lupini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d6abf48e934220263f35807d2d8320a4361dee8da718a29e45593b830e381b4.png"
}

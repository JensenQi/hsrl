package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KalimosPrimalLord_41331 : Card() {
    override val id = 41331
    override val name = "荒蛮之主卡利莫斯"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则施放一个元素祈咒。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "炼金术师认为只要将土、气、水、火四种元素结合在一起，就能产生第五元素。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c78f3f78ce7e97b65ff756d08352b03d6f58421980271153ea5e3a945f97f4d.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireHawk_55405 : Card() {
    override val id = 55405
    override val name = "火鹰"
    override val description = "<b>战吼：</b>你的对手每有一张手牌，该随从便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "都怪我们推出了那些看起来就好吃的卡背图案。"
    override val artist = "Servando Lupini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85542f993ad25c4e5a9bcaa2465fec974f0db11ac0ebd3615430008582cec263.png"
}

package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Muckmorpher_51727 : Card() {
    override val id = 51727
    override val name = "泥沼变形怪"
    override val description = "<b>战吼：</b>变形成为你的牌库中一个其他随从的4/4复制。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "泥沼龙战队最受欢迎的成员。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ace7ae99d5e86f8a6fa28e553895db0709b2f3d8ccefa2578cbcae5d97783355.png"
}

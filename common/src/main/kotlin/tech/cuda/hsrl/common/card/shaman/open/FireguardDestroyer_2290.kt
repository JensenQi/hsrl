package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireguardDestroyer_2290 : Card() {
    override val id = 2290
    override val name = "火焰驱逐者"
    override val description = "<b>战吼：</b>获得1-4点攻击力。<b>过载：</b>（1）"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Brm
    override val background = "很多火元素竞相面试“火焰驱逐者”的职位，但拉格纳罗斯认为只有极少数火元素能够胜任。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/20ac6ca1b5539ee53a91e15fc9f349e0d93c39953248b40da875ac2028f1a817.png"
}

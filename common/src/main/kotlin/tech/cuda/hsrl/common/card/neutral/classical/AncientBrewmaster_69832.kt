package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientBrewmaster_69832 : Card() {
    override val id = 69832
    override val name = "年迈的酒仙"
    override val description = "<b>战吼：</b>使一个友方随从从战场上移回你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "大部分熊猫人都喜欢去他的酒坊喝酒，然后在好几天以后才能记起回家的路。"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4bdea2d2ec63e2df5d682baa25d34facbcccca0e9672138c5bc538160ae53fd2.png"
}

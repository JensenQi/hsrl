package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientBrewmaster_186 : Card() {
    override val id = 186
    override val name = "年迈的酒仙"
    override val description = "<b>战吼：</b>使一个友方随从从战场上移回你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "大部分熊猫人都喜欢去他的酒坊喝酒，然后在好几天以后才能记起回家的路。"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2de60a562b62fcf35fbab5650db7a473e2a12ede8d5217dfe41c9e0eac034fc1.png"
}

package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TuskarrTotemic_2513 : Card() {
    override val id = 2513
    override val name = "海象人图腾师"
    override val description = "<b>战吼：</b>随机召唤一个基础图腾。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "事实证明海象人对于图腾的样式一点都不挑剔。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ded9e6e5116d8eb2a8497c7858be1d9e9474b5872a93b58edb4ec3be1c17e33.png"
}

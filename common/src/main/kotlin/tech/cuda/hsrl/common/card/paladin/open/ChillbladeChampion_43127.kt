package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChillbladeChampion_43127 : Card() {
    override val id = 43127
    override val name = "寒刃勇士"
    override val description = "<b>冲锋，吸血</b>"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "能守能攻，一剑两用，寒刃出鞘，谁与争锋。拿上它，连最矮小的侏儒也能成为勇士。"
    override val artist = "Kevin Chen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89d56b04cbdebcdab105c97432919e341b19327e92e9fbe56c106374a45e1a41.png"
}

package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExpiredMerchant_53885 : Card() {
    override val id = 53885
    override val name = "过期货物专卖商"
    override val description = "<b>战吼：</b>弃掉你手牌中法力值消耗最高的牌。<b>亡语：</b>将弃掉的牌的两张复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“保质期”什么的只是用来参考的啦。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75245915ab90265405d990325d2ed65f42dd9f02237cf023fd8f30a110e959b0.png"
}

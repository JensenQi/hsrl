package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FarWatchPost_62583 : Card() {
    override val id = 62583
    override val name = "前沿哨所"
    override val description = "无法攻击。在你的对手抽一张牌后，使其法力值消耗增加（1）点<i>（最高不超过10点）</i>。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "Dabu，兄弟，它好像离战场越来越远了。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c8ad517f186c9ec6f62a3343a57d81e351fede45a53e4e62e43b01a03f92018a.png"
}

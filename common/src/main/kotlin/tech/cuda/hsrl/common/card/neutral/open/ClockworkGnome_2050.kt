package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClockworkGnome_2050 : Card() {
    override val id = 2050
    override val name = "发条侏儒"
    override val description = "<b>亡语：</b>将一张<b>零件</b>牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "发条侏儒总是会问：“现在几点？”因为他需要有人定时帮他旋紧发条。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/849d1d3add0827cf714cb329cc7d5f761570667aa525430b39f61558263d46bb.png"
}

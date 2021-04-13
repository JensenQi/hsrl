package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FaithfulLumi_48025 : Card() {
    override val id = 48025
    override val name = "可靠的灯泡"
    override val description = "<b>战吼：</b>使一个友方机械获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "小小灯泡，脑门锃亮；左摇右摆，晕头转向。"
    override val artist = "Zero"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b0532f86c748100a2a7f8f08786221bc6ceee969208c2e3a49b76bc23526804.png"
}

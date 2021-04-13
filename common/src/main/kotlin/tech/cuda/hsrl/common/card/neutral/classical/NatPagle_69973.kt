package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NatPagle_69973 : Card() {
    override val id = 69973
    override val name = "纳特·帕格"
    override val description = "在你的回合开始时，你有50%的几率额外抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "纳特·帕格是艾泽拉斯最棒的钓手！他发明了自动鱼竿3000型，伸缩鱼竿3000型，以及电气自动诱捕器2099型（仍在测试中）。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd6d1bc0d43aea39c76d3fedc0ddc84063606e0b376cbc0525d8d29288be430d.png"
}

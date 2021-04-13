package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NatPagle_1147 : Card() {
    override val id = 1147
    override val name = "纳特·帕格"
    override val description = "在你的回合开始时，你有50%的几率额外抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "纳特·帕格是艾泽拉斯最棒的钓手！他发明了自动鱼竿3000型，伸缩鱼竿3000型，以及电气自动诱捕器2099型（仍在测试中）。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/47f2a1ceec8a729adfbf48a396d7458391748c9c2887976fe35a28ee3c71b9b2.png"
}

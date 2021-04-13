package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WeaselTunneler_40549 : Card() {
    override val id = 40549
    override val name = "鼬鼠挖掘工"
    override val description = "<b>亡语：</b>将该随从洗入你对手的牌库。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "就是因为他，加基森银行才花了大笔钱来采购钢筋地板。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb2c4ac64d0c845c5ee14d7a7e0c8c06a68b3ec7708480471b2a46f6ff416d50.png"
}

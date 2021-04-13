package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorrosiveSludge_43469 : Card() {
    override val id = 43469
    override val name = "腐蚀淤泥"
    override val description = "<b>战吼：</b> 摧毁对手的武器。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "这就是几百年不清理下水道的下场。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8bea20dbc6117bc5cf8bc0582660775746588520a6ed6d94936ecbaa0dbd2bf1.png"
}

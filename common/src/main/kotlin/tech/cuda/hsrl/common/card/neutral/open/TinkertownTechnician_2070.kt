package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TinkertownTechnician_2070 : Card() {
    override val id = 2070
    override val name = "工匠镇技师"
    override val description = "<b>战吼：</b>如果你控制一个机械，便获得+1/+1并将一张<b>零件</b>牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "要不你就带我去...工匠镇？"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41df2c83c6cafa78443ace2f105382fab02e58773a7fe1de3b77e0fe84aa8cfb.png"
}

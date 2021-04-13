package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HyldnirFrostrider_45377 : Card() {
    override val id = 45377
    override val name = "海德尼尔冰霜骑士"
    override val description = "<b>战吼：</b><b>冻结</b>你的其他随从。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "别犯傻了，冲着谁去是北极熊说了算的。"
    override val artist = "Marcelo Vignali"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa9e8ee7a1c4ac7a91f46cbf3d275d6753352344d9d4a8fa9d8891b4eb6f582f.png"
}

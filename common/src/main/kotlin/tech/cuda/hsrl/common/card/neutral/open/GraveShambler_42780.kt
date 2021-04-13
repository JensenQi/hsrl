package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GraveShambler_42780 : Card() {
    override val id = 42780
    override val name = "墓地蹒跚者"
    override val description = "每当你的武器被摧毁时，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "不知道是哪个死灵法师干的，做的有点过头了。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1605909cfe0f2cf3c3879491a65204e57989f8ce4397dbfb2bef0ebc82f5c798.png"
}

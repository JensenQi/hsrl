package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighInquisitorWhitemane_69673 : Card() {
    override val id = 69673
    override val name = "大检察官怀特迈恩"
    override val description = "<b>战吼：</b>召唤所有在本回合中死亡的友方 随从。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "没人告诉过她，其实勇士们并不想起来。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eeebff72751d3a1ad38e345dcacb863947be485c5d298e0fb7519c5728d68962.png"
}

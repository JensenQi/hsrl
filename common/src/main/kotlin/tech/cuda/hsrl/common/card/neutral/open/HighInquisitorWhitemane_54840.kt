package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighInquisitorWhitemane_54840 : Card() {
    override val id = 54840
    override val name = "大检察官怀特迈恩"
    override val description = "<b>战吼：</b>召唤所有在本回合中死亡的友方 随从。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "没人告诉过她，其实勇士们并不想起来。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/495e7f24c27bfd7f9d818133e16ea9ef7e95b38543a34b04e14baae532f4d55b.png"
}

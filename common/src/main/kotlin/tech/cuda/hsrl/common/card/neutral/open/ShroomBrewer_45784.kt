package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShroomBrewer_45784 : Card() {
    override val id = 45784
    override val name = "蘑菇酿酒师"
    override val description = "<b>战吼：</b> 恢复 4点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "保证会有副作用！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f6644beafd4603074849d569ff339d5dabaf00d56108dfd45675bf18dd20a9e.png"
}

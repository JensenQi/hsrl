package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PotionVendor_52312 : Card() {
    override val id = 52312
    override val name = "药水商人"
    override val description = "<b>战吼：</b>为所有友方角色恢复 2点生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "每人只能恢复2点，因为她只能抱住这么多。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fcc464a7bb61aa24091337f2cafa94a19d346908284c6d60e44773d84c1fbeb6.png"
}

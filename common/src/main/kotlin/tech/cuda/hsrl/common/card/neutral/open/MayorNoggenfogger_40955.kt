package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MayorNoggenfogger_40955 : Card() {
    override val id = 40955
    override val name = "诺格弗格市长"
    override val description = "所有角色都会随机选择目标。"
    override var cost: Int? = 9
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "能够游走于三大家族之间的人，想必也不是个普通角色。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/21238b9a73f6cdfce88586bdf3298ad1a78b281dd0eed4f922ddacf84c711b13.png"
}

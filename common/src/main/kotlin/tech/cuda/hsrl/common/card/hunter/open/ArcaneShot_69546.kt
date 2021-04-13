package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneShot_69546 : Card() {
    override val id = 69546
    override val name = "奥术射击"
    override val description = "造成 2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "法师们用奥术强化箭矢，然后出售给猎人；后来猎人们自己学会了足够的魔法之后便能够自给自足。不少法师因此失业，给暴风城的经济带来不小的冲击。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a77d676fd5261ef325dcebf4b371819e73da1f928abd5fef014bfb9d1f12d22.png"
}

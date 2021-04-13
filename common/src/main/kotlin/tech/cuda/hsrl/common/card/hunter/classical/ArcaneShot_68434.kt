package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneShot_68434 : Card() {
    override val id = 68434
    override val name = "奥术射击"
    override val description = "造成 2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "法师们用奥术强化箭矢，然后出售给猎人；后来猎人们自己学会了足够的魔法之后便能够自给自足。不少法师因此失业，给暴风城的经济带来不小的冲击。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e67827d85828098534fc993fc43f083710bdb90b3678e19e31b1f7b79820eb1.png"
}

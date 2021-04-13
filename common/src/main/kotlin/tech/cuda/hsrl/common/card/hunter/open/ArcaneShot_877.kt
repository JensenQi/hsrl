package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneShot_877 : Card() {
    override val id = 877
    override val name = "奥术射击"
    override val description = "造成 2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "法师们用奥术强化箭矢，然后出售给猎人；后来猎人们自己学会了足够的魔法之后便能够自给自足。不少法师因此失业，给暴风城的经济带来不小的冲击。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/782ff140d7857d16513f551bf9c93967ba92a268b798daadd2b98f3e49561718.png"
}

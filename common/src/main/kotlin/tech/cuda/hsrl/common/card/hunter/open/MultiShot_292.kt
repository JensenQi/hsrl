package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MultiShot_292 : Card() {
    override val id = 292
    override val name = "多重射击"
    override val description = "随机对两个敌方随从造成 3点 伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "看见没，我完全可以“一心两用”。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c9617eb51e195c21625836dcd1ca2dc43dcecc064d09b23a04b737642cfef213.png"
}

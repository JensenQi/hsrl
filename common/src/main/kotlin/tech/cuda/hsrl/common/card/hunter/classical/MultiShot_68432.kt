package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MultiShot_68432 : Card() {
    override val id = 68432
    override val name = "多重射击"
    override val description = "随机对两个敌方随从造成 3点 伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "看见没，我完全可以“一心两用”。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6255e8c0b26d6b2e1465b74e81592ffbb354c314669a5de380b3d2e966c8d872.png"
}

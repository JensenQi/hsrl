package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Penance_54425 : Card() {
    override val id = 54425
    override val name = "苦修"
    override val description = "<b>吸血</b> 对一个随从造成 3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "这就是不和牧师好好说话的下场。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82a64d01be730b4f673e30dc844609f4ac39cdc9de856040fcaeba49f2a8aeb8.png"
}

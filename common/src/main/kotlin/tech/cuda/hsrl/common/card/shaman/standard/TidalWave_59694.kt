package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TidalWave_59694 : Card() {
    override val id = 59694
    override val name = "潮汐奔涌"
    override val description = "<b>吸血</b> 对所有随从造成 3点伤害。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "巨浪，巨浪，不断地增长！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1338432f5e90ef28c0bfd2e23908b5f74f9b22f114ef4d9d9684b1fe8e2b163f.png"
}

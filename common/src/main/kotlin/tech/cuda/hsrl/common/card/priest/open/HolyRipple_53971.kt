package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyRipple_53971 : Card() {
    override val id = 53971
    override val name = "神圣涟漪"
    override val description = "对所有敌人造成 1点伤害，为所有友方角色 恢复 1点生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "神圣的能量波纹不断扩散，味道依然有点熏人。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/da71d2394abe150691674516a04b5686559488e3fe31f42ad7e36987e95e84ac.png"
}

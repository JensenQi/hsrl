package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlashHeal_69707 : Card() {
    override val id = 69707
    override val name = "快速治疗"
    override val description = "恢复 5点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "快治……英雄阵亡！"
    override val artist = "Marcelo Vignali"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59b963cfbe845f237ed445a9fd5db6f2616a85b352840a114d5432df8e420f62.png"
}

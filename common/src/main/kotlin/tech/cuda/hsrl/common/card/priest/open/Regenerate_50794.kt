package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Regenerate_50794 : Card() {
    override val id = 50794
    override val name = "再生"
    override val description = "恢复 3点生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你得把自己的灵魂卖给地狱魔王，才能获得超能力。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e55683800c167f90fdcfed00f6bec69a2a5907e3c900016cdad0db9c88c26c4a.png"
}

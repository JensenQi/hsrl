package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SupremeAbyssal_57194 : Card() {
    override val id = 57194
    override val name = "渊狱至尊"
    override val description = "无法攻击英雄。"
    override var cost: Int? = 8
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "但你仍会有遭到攻击的感觉。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7efcb35a5008db9e7666099e146195c70e16689119448e0822a76a9e6c506756.png"
}

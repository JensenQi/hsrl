package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImmolationAura_59869 : Card() {
    override val id = 59869
    override val name = "献祭光环"
    override val description = "对所有随从造成 1点伤害两次。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "没有金刚钻，别往火里站。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ed1f82bc647876aaa179c0f79e2e2c08aa44a0251340ebac12a11e7e69f8cdc.png"
}

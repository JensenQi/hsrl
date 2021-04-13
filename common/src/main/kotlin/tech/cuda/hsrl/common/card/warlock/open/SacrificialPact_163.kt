package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SacrificialPact_163 : Card() {
    override val id = 163
    override val name = "牺牲契约"
    override val description = "消灭一个友方恶魔，为你的英雄恢复 5点生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "这就是恶魔不愿意和术士交朋友的原因。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bafc9483413f41b10978eab3d6095a2ad89294ca54a9775ad2060c6847cdc0f9.png"
}

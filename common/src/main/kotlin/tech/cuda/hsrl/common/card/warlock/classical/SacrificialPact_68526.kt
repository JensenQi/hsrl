package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SacrificialPact_68526 : Card() {
    override val id = 68526
    override val name = "牺牲契约"
    override val description = "消灭一个恶魔，为你的英雄恢复 5点生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "这就是恶魔不愿意和术士交朋友的原因。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2140588889faa4242d2110eb8a14ab4b35d4ea13a21ba64b565572fedf789d20.png"
}

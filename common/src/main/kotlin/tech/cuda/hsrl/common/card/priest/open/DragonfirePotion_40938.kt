package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonfirePotion_40938 : Card() {
    override val id = 40938
    override val name = "龙息药水"
    override val description = "对所有非龙随从造成 5点伤害。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "如何把龙息放进药水里，这是一门学问。"
    override val artist = "Charlene Le Scanff"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f45975f0e5280a2270f9f15cb95b1d6859c90db59a9dd62d43b9959eb5260805.png"
}

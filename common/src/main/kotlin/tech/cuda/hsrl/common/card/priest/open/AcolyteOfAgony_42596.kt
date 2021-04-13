package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcolyteOfAgony_42596 : Card() {
    override val id = 42596
    override val name = "酷虐侍僧"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "只有经过长年累月的实践才能真正掌握这种痛苦的艺术。"
    override val artist = "Brom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24748aeb701761de1545297e2ad755c1a37af29d3da0cacae1c97a84f804e3e7.png"
}

package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldrachiWarblades_69507 : Card() {
    override val id = 69507
    override val name = "奥达奇战刃"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "远古的奥达奇人曾是宇宙中最强的战斗部族。试想如果他们把刀柄老老实实地安在武器的一端，那该有多强。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e440dc47116a84f367317d6975bcaba7483bcde099cbf7cd668b49ac9069c22.png"
}

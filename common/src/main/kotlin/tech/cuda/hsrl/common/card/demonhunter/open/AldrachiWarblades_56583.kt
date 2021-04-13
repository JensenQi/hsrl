package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldrachiWarblades_56583 : Card() {
    override val id = 56583
    override val name = "奥达奇战刃"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "远古的奥达奇人曾是宇宙中最强的战斗部族。试想如果他们把刀柄老老实实地安在武器的一端，那该有多强。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f2968d5b4efe10c04ffae94323ba1e03bf7fa51cbbec3d819535611f66d21450.png"
}

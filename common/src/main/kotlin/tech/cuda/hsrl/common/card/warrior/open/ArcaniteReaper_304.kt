package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaniteReaper_304 : Card() {
    override val id = 304
    override val name = "奥金斧"
    override val description = ""
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "“那个消失了的潜行者再也不曾出现过...”"
    override val artist = "Stefan Kopinski"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe76aec2cd0eeeca579a80b1635f0bebcff4718249787030799b4f57c2d98b82.png"
}

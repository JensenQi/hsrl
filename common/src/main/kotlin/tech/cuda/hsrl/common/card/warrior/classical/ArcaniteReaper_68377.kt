package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaniteReaper_68377 : Card() {
    override val id = 68377
    override val name = "奥金斧"
    override val description = ""
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "“那个消失了的潜行者再也不曾出现过...”"
    override val artist = "Stefan Kopinski"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0cb0d533e843e3cd7f3ef080d4623ae5890306bb8b0e0d3b7b3725ec4f838563.png"
}

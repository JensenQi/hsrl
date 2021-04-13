package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldBlock_1023 : Card() {
    override val id = 1023
    override val name = "盾牌格挡"
    override val description = "获得5点护甲值。抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "光有面罩是不够的，所以人们发明了盾牌。"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8f836c4515ed06e0fca53811edd0b6c1dfab91cff7efdcb71d5b0b140f4f1c2.png"
}

package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldBlock_68479 : Card() {
    override val id = 68479
    override val name = "盾牌格挡"
    override val description = "获得5点护甲值。抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "光有面罩是不够的，所以人们发明了盾牌。"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88a0e40a605e4fca893efd2a84f03c9451e11ed20fb942fa2c44aeb6deef425d.png"
}

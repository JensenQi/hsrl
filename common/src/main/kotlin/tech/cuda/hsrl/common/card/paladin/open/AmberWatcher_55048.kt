package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AmberWatcher_55048 : Card() {
    override val id = 55048
    override val name = "琥珀看守者"
    override val description = "<b>战吼：</b> 恢复 8点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "人在空中难免伤，巨龙盛来琥珀光。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36e876c7276a8d99edfbcffb04f931de982f5969009ab3beb6997322ab2d87d7.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LuckydoBuccaneer_40791 : Card() {
    override val id = 40791
    override val name = "土地精海盗"
    override val description = "<b>战吼：</b> 如果你的武器至少具有3点攻击力，便获得+4/+4。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "记得要把幸运符带在身上，尤其是在加基森！"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba9204f06cb06ca1801523e26b7e8b80ec94576bf66810928013779787289ea1.png"
}

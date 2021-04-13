package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BonechewerRaider_56734 : Card() {
    override val id = 56734
    override val name = "噬骨骑兵"
    override val description = "<b>战吼：</b>如果有受伤的随从，便获得+1/+1和<b>突袭</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "如果受伤的随从身上还有个飞盘，千万要小心！"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/caf21ad664e2f831b30bd770a532b7111aa15c594c504c6dc5b394f99851947d.png"
}

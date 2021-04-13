package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArathiWeaponsmith_69949 : Card() {
    override val id = 69949
    override val name = "阿拉希武器匠"
    override val description = "<b>战吼：</b>装备一把2/2的武器。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "拳套武器限时特惠，第二把半价！"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9d682f30a5c17e334e0f53c2d902672b619a51ed19eabfaf86182b35f9c3617.png"
}

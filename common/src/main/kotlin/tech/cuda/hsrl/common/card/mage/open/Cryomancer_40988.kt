package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cryomancer_40988 : Card() {
    override val id = 40988
    override val name = "凛风巫师"
    override val description = "<b>战吼：</b>如果有敌人被<b>冻结</b>，便获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "人人都爱她，尤其是在夏天！"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/17ba3c56dfa4a32865ebcc3fbf047fa6f55d14b10a26021861cc851a6dc431af.png"
}

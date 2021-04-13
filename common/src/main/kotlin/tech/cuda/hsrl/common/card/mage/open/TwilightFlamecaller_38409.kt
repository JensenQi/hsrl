package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightFlamecaller_38409 : Card() {
    override val id = 38409
    override val name = "暮光烈焰召唤者"
    override val description = "<b>战吼：</b>对所有敌方随从造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "暮光烈焰召唤者供能稳定，火力十足，是户外烧烤的首选之人。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34b6baef405141cb1d404a02ff436042a10b14d00c26ceb19f70ecffd47e9347.png"
}

package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldHermit_43329 : Card() {
    override val id = 43329
    override val name = "狗头人隐士"
    override val description = "<b>战吼：</b>选择一个基础图腾并召唤它。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "要想真正理解蜡烛，需要花好多年来研究。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85648d96e5462139dba8de6f028b8bab3434a6f1c24c5354f0dff6f81b9fd5bf.png"
}

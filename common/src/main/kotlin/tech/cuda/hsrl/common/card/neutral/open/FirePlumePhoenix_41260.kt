package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FirePlumePhoenix_41260 : Card() {
    override val id = 41260
    override val name = "火羽凤凰"
    override val description = "<b>战吼：</b>造成2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "凤凰本非凡俗鸟，浴火重生凌云霄。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/503fba3ba2f43e4a48fdb3cbd72e6e7efc1a1233fc5e20f55fb81bab97e2cecd.png"
}

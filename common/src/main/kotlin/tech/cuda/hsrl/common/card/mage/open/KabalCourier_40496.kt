package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalCourier_40496 : Card() {
    override val id = 40496
    override val name = "暗金教信使"
    override val description = "<b>战吼：</b> <b>发现</b>一张法师、牧师或术士卡牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "瞧见没，把科多兽停在鹰身人的巢穴下，你就等着洗坐垫吧。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee8f08033d57a0da8764ad21e6ae8ddd485cb4a290857e2995851e61f56e4eb0.png"
}

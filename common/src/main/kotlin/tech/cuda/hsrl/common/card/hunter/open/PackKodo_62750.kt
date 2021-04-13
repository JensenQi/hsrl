package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PackKodo_62750 : Card() {
    override val id = 62750
    override val name = "载货科多兽"
    override val description = "<b>战吼：</b><b>发现</b>一张野兽牌，<b>奥秘</b>牌或 武器牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "外表看起来心思单纯，其实它负担很重。"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c420b674ed042d61c3282422981a408382931feeef800ba8fe9a37769f04567.png"
}

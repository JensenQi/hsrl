package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimscaleChum_40531 : Card() {
    override val id = 40531
    override val name = "暗鳞劫掠者"
    override val description = "<b>战吼：</b>随机使你手牌中的一张鱼人牌获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "把他们带到码头上，再丢到海里去，听明白了吗？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d69a25dde5fc6fd4e270bb973ed090c6bb87f8f116a48acece0dd0fc02a2fe36.png"
}

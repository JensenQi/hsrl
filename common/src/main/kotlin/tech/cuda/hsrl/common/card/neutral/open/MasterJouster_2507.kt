package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterJouster_2507 : Card() {
    override val id = 2507
    override val name = "大师级枪骑士"
    override val description = "<b>战吼：</b>揭示双方牌库里的一张随从牌。如果你的牌法力值消耗较大，则获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "再爬几个月的天梯就能成为宗师级枪骑士了。"
    override val artist = "Penny Arcade"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5a22423c48fd571ae00bc379e682d2d6e3ccf9163374272f62c0af6dd363cb3.png"
}

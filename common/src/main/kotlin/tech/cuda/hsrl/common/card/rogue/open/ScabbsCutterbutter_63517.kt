package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScabbsCutterbutter_63517 : Card() {
    override val id = 63517
    override val name = "斯卡布斯·刀油"
    override val description = "<b>连击：</b>在本回合中，你使用的下两张牌的法力值消耗减少 （3）点。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“永远不要欺骗，不要偷盗，不要抄袭，不要贪饮。除非你受到了胁迫，那么……”——斯卡布斯·刀油"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d0c7631a8a9cc774b7987e7520a44feabe745a928329615949796f665ee2e44.png"
}

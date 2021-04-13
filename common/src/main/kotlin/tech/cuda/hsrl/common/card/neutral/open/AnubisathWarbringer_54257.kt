package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnubisathWarbringer_54257 : Card() {
    override val id = 54257
    override val name = "阿努比萨斯战争使者"
    override val description = "<b>亡语：</b>使你手牌中的所有随从牌获得+3/+3。"
    override var cost: Int? = 9
    override var health: Int? = 6
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "一般的小狗只会叼回来骨头或磨牙棒，而它带回来的则是战争！"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2f2fa0485abf27581dfe0cf409575834709ff8c03181ef8cf93244c7e4ae6a5.png"
}

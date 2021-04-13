package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hecklebot_51733 : Card() {
    override val id = 51733
    override val name = "机械拷问者"
    override val description = "<b>嘲讽，战吼：</b>使你的对手从牌库中召唤一个随从。"
    override var cost: Int? = 4
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“打死我也不说！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa5c5c75549c3e0b6edaca79e51e96ecb39e97b30b2718efa9afa693f0a38044.png"
}

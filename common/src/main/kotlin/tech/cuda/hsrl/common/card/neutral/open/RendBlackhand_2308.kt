package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RendBlackhand_2308 : Card() {
    override val id = 2308
    override val name = "雷德·黑手"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则消灭一个<b>传说</b>随从。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "雷德坚持认为自己才是部落真正的领袖。于是他登录某百科网站，修改了“部落酋长”词条，加入了他自己的照片。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0013316dcd4f182fcc81166cfd3fb974f744586400dfdca1bf10c3e670fddf58.png"
}

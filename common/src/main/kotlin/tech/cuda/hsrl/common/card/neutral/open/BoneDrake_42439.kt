package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoneDrake_42439 : Card() {
    override val id = 42439
    override val name = "白骨幼龙"
    override val description = "<b>亡语：</b>随机将一张龙牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "我们坐在高高的骨堆旁边，听妈妈讲那过去的事情。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4927cef4d9ea315533af5d766a3313d4d25882d0457046f1324c43f9f717edf1.png"
}

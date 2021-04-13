package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PilotedShredder_2064 : Card() {
    override val id = 2064
    override val name = "载人收割机"
    override val description = "<b>亡语：</b>随机召唤一个法力值消耗为（2）的随从。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "在过去，只有地精会驾驶这玩意儿。如今，从末日预言者到精灵龙再到游学者周卓，好像大家都喜欢驾驶收割机。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56ed61c236979efd9c71899336e5c53705fdf1c0b45e27fc4ec2af6bc4e087f3.png"
}

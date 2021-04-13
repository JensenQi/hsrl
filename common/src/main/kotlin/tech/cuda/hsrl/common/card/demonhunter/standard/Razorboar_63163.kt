package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Razorboar_63163 : Card() {
    override val id = 63163
    override val name = "剃刀野猪"
    override val description = "<b>亡语：</b>从你的手牌中召唤一个法力值消耗小于或等于（3）点的<b>亡语</b>随从。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "第四只小猪的房子是用<b>复仇的意志</b>盖成的。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e3992a4467e0a52efe28494a68a87dac93c6a3a67123b60cb579d220f2cd9d5.png"
}

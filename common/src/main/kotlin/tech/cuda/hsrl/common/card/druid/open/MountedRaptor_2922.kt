package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MountedRaptor_2922 : Card() {
    override val id = 2922
    override val name = "骑乘迅猛龙"
    override val description = "<b>亡语：</b>随机召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Loe
    override val background = "驾驭迅猛龙的第一课，就是别被它吃掉！"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c8387cecb44a64f4cdfc7b2655d7ac2a175c972fadabf61bf37caa0eae75502.png"
}

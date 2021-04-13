package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sulthraze_50056 : Card() {
    override val id = 50056
    override val name = "鞭笞者苏萨斯 "
    override val description = "<b>超杀</b>：你可以再次攻击。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "格里伏塔鼎力推荐，好用的苏萨斯，一刀四点伤害，两刀八点伤害，彻底颠覆你的战斗方式。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f12ffd05730fe3318817596ec1c1f5f504f2020eed24c847c8ffb505c7d2eeee.png"
}

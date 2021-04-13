package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScourgelordGarrosh_43423 : Card() {
    override val id = 43423
    override val name = "天灾领主加尔鲁什"
    override val description = "<b>战吼：</b>装备一把4/3的影之哀伤，影之哀伤同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 8
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "“你敢挑战我？来啊！马上你就会咽下最后一口气——然后，你就是我的了。”"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e037d6d543a48acb5059477733ed783ec0a0d21e6a73347f16feb43006c9289.png"
}

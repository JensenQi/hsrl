package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RingmastersBaton_61246 : Card() {
    override val id = 61246
    override val name = "马戏领班的节杖"
    override val description = "在你的英雄攻击后，使你手牌中的一张机械牌，龙牌和海盗牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "一个机械，一条龙和一个海盗走进了古神张开的巨口中。机械太硬了，龙又太烫了，只有海盗刚好合口。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a31dd1962dea37a38eae909b3d14846f3918d4c2184abc7f318839424be02678.png"
}

package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RumblingElemental_2888 : Card() {
    override val id = 2888
    override val name = "顽石元素"
    override val description = "在你使用一张具有 <b>战吼</b>的随从牌后，随机对一个敌人造成2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Loe
    override val background = "顽石元素也很顽皮，他通常会把受害者折磨得死去活来。"
    override val artist = "Cole Eastburn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c63171352c8acecbbd30cad2f62abbc0f7ff867c39c2f5cf96cf8a22d0af1c0.png"
}

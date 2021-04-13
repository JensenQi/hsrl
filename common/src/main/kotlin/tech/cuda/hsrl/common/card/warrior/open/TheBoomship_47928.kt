package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBoomship_47928 : Card() {
    override val id = 47928
    override val name = "砰砰飞艇"
    override val description = "随机从你的手牌中召唤三个随从，并使其获得<b>突袭</b>。"
    override var cost: Int? = 9
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "砰砰博士以奇兵突袭的方式，结束了他的精彩演讲。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cbcae400da772b0da343c604818226d8c93dd89efc13e284702e911c64a75dd2.png"
}

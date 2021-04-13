package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ApothecarysCaravan_63193 : Card() {
    override val id = 63193
    override val name = "药剂师车队"
    override val description = "在你的回合开始时，从你的牌库中召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "你要是不把药剂交出来，我们就把药剂送到你嘴里去。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/369a3b8917bf7a7491a115de92de6fa72df4a9554e10edf21b6f9a121d37c6ee.png"
}

package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SeadevilStinger_40691 : Card() {
    override val id = 40691
    override val name = "海魔钉刺者"
    override val description = "<b>战吼：</b>在本回合中，你使用的下一张鱼人牌不再消耗法力值，转而消耗生命值。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "其实在刺你的同时，他也很受伤。这就是所谓的互相伤害吧。"
    override val artist = "Yewon Park"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81826907538f0b53c698c2308e34fa709d645e57cc58dc86fce8ac3b6d0e10c1.png"
}

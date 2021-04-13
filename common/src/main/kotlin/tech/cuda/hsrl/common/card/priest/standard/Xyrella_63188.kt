package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Xyrella_63188 : Card() {
    override val id = 63188
    override val name = "泽瑞拉"
    override val description = "<b>战吼：</b>在本回合中，如果你恢复过生命值，则对所有敌方随从造成等量的伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "星陨之夜，泽瑞拉预见了一幅景象。是一个破碎的纳鲁。“去贫瘠之地，”它说，“寻找我的碎片，治愈我的身体。而我，会治愈你的女儿。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c5ec277b0c6d76df9d384c1d274856a690940600297bb000774afc7dfaaf9a9.png"
}

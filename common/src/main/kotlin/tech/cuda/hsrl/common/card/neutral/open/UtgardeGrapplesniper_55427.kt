package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UtgardeGrapplesniper_55427 : Card() {
    override val id = 55427
    override val name = "乌特加德鱼叉射手"
    override val description = "<b>战吼：</b>每个玩家抽一张牌。如果是龙牌，则将其召唤。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "注意：巨龙在冲过来的时候脾气可能会有点大。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/064283ada850f2524b4c14e156d800ed3b5f9f20bdd058b59eeb1ce7fb04d3ea.png"
}

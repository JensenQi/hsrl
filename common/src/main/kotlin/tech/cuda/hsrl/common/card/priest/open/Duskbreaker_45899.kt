package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Duskbreaker_45899 : Card() {
    override val id = 45899
    override val name = "破晓之龙"
    override val description = "<b>战吼：</b> 如果你的手牌中有龙牌，则对所有其他随从造成3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“它将在暮光散去时醒来。”——说的就像谁不是一样。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/863cf28c34afb37c6cc001db9495da5b1cb151c5b45a7d1299152b4847e2816c.png"
}

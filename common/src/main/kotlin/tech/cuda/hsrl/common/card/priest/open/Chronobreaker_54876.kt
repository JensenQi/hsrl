package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Chronobreaker_54876 : Card() {
    override val id = 54876
    override val name = "时空破坏者"
    override val description = "<b>亡语：</b>如果你的手牌中有龙牌，则对所有敌方随从造成3点 伤害。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "如果他要借用你的手表，千万要说不。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e90654445acbd094d2cfc2eb21e6f1704af4533e1028c4ad7828e8c21334e2c1.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneBreath_54906 : Card() {
    override val id = 54906
    override val name = "奥术吐息"
    override val description = "对一个随从造成 2点伤害。如果你的手牌中有龙牌，便<b>发现</b>一张法术牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "食用奥术饼干的众多副作用之一。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6cc0cd2093207130e49311f5a8b89c46c3d534872c077fa09527f93f5983b213.png"
}

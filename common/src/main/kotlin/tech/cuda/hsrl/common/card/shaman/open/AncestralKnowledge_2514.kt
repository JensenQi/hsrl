package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestralKnowledge_2514 : Card() {
    override val id = 2514
    override val name = "先祖知识"
    override val description = "抽两张牌。<b>过载：</b>（2）"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "先祖赐予我卡牌！！！"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/261da2c5b4f0c64ddf600fbb138fce9ee28c9fb09d980489ae74d3f139451ef0.png"
}

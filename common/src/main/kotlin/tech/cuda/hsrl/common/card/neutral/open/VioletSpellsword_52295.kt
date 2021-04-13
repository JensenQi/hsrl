package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletSpellsword_52295 : Card() {
    override val id = 52295
    override val name = "紫罗兰魔剑士"
    override val description = "<b>战吼：</b>你手牌中每有一张法术牌，便获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "需要用到魔法的剑士，一般剑法也不怎么样。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3512c7101e86280c60b32c39b29287a31b0d8aff7bc30d72db555a028163425f.png"
}

package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GurubashiBerserker_69554 : Card() {
    override val id = 69554
    override val name = "古拉巴什狂暴者"
    override val description = "每当该随从受到伤害，便获得 +3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "如果那些伤痛没能让你死掉，它们就会让你更强大。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f171b3160e6aa59bc85750b1c57ee23ade2dea8b898a7ae830711e1a194aeb3.png"
}

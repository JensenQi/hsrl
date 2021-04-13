package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvasiveWyrm_55429 : Card() {
    override val id = 55429
    override val name = "辟法巨龙"
    override val description = "<b>圣盾，突袭</b> 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "八百巨龙奔北坡，北坡法师并排跑。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83bb37175daf473eaeb0e14d36140707162762bdb4ac5ba869fca053936e125b.png"
}

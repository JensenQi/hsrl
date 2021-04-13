package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StarAligner_49195 : Card() {
    override val id = 49195
    override val name = "群星罗列者"
    override val description = "<b>战吼：</b>如果你控制三个生命值为7的随从，对所有敌人造成7点 伤害。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "群星认为你还有所欠缺。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c935366d04520c4afd7e851e7445d0d47a87dc96f4f5ccfddb78abd368af97e.png"
}

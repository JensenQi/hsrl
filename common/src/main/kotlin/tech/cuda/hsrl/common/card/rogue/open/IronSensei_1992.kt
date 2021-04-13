package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronSensei_1992 : Card() {
    override val id = 1992
    override val name = "钢铁武道家"
    override val description = "在你的回合结束时，使另一个友方机械获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "战斗机械装置都遵从他的教诲。只有他会用0和1告诉他们怎么战斗。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e104df329f8b1f8c1f587226f838ce7b6b6fd131f422a30dca545bf593b90f31.png"
}

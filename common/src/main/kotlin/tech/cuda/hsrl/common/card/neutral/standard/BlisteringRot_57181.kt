package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlisteringRot_57181 : Card() {
    override val id = 57181
    override val name = "起泡的腐泥怪"
    override val description = "在你的回合结束时，召唤一个属性值等同于该随从的腐质。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "伊利达雷称之为“腐糊护肤”凝胶，对抗德拉诺暴烈的阳光特别有效。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfdeb5a4c467ab52ec5fb0497be170baf39e613f978ed1adcd4ed73b47e82fb2.png"
}

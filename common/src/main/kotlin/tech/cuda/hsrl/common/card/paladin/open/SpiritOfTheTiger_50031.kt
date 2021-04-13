package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheTiger_50031 : Card() {
    override val id = 50031
    override val name = "猛虎之灵"
    override val description = "<b>潜行</b>一回合。在你施放一个法术后，召唤一只属性值 等于其法力值消耗的老虎。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "心有猛虎，细嗅蔷薇。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9611235e30f18aeb9946e551557f72cca5d9dc4d2912d740bca1e5b62241fa3f.png"
}

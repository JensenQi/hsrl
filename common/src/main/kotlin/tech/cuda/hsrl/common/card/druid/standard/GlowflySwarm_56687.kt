package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlowflySwarm_56687 : Card() {
    override val id = 56687
    override val name = "萤火成群"
    override val description = "你的手牌中每有一张法术牌，召唤一只2/2的萤火虫。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "在没有沼泽射线的年代，德鲁伊们白天捕捉萤火虫，晚上靠着萤火虫的亮光学习法术。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca26f49d5beabfd507db2b06a84e70756950ebf407da3b4fceb6f800b426d4e6.png"
}

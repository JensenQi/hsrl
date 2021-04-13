package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecklessExperimenter_49416 : Card() {
    override val id = 49416
    override val name = "鲁莽的实验者"
    override val description = "你使用的<b>亡语</b>随从牌的法力值消耗减少（3）点，但会在回合结束时死亡。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "虽说鲁莽，但她倒是很清楚自己想要什么。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/691f16d0f00d8534cf1626e91f2d785e191b50ec0a3043b834296c3ef614db5c.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kelthuzad_1794 : Card() {
    override val id = 1794
    override val name = "克尔苏加德"
    override val description = "在每个回合结束时，召唤所有在本回合中死亡的友方随从。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "克尔苏加德迷恋于巫妖王的声音。即使是巫妖王在电话自动语音中的留言也让他甘之若饴。"
    override val artist = "Chris Robinson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c003391d9f8277a3081a6d42535fd8c1daaec6ec117bd773d29507b9d6eef136.png"
}

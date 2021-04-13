package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KaelthasSunstrider_56622 : Card() {
    override val id = 56622
    override val name = "凯尔萨斯·逐日者"
    override val description = "在每回合中，你每施放三个法术，第三个法术的法力值消耗为（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“但巨龙降临的时代早就过去了！”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89e1de641c8968fda2630c5f66fd40af9e60210fffdd03b6013be9421bcbcc1d.png"
}

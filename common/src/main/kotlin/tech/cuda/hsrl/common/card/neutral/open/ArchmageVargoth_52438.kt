package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchmageVargoth_52438 : Card() {
    override val id = 52438
    override val name = "大法师瓦格斯"
    override val description = "在你的回合结束时，施放你在本回合中施放过的一个法术<i>（目标随机而定）</i>。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他是大法师没错，但他也该练一练基本功……比如瞄准。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cdbf5f41553a2c41ff1672aa24d553353eab3e21e1084b54dcce9101ad5c9a11.png"
}

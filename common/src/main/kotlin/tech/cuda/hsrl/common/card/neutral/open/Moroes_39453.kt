package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Moroes_39453 : Card() {
    override val id = 39453
    override val name = "莫罗斯"
    override val description = "<b>潜行</b> 在你的回合结束时，召唤一个1/1的 家仆。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "虽然莫罗斯管理着卡拉赞众多的家仆，但给气球充气这种活还得他自己来干。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2d0a9a4fc8d74bc530257c1a0d326ba2dbadb0c123445e0d0e9ef742cbba41c.png"
}

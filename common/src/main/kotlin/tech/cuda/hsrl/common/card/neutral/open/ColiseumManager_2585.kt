package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColiseumManager_2585 : Card() {
    override val id = 2585
    override val name = "角斗场主管"
    override val description = "<b>激励：</b>将该随从移回你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "他每个月都会找角斗士来谈谈职业规划的问题。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/62517f76a23a73ceb97e23d36b4c6a9408209c5d6eebb4422ac5d9f601cee24a.png"
}

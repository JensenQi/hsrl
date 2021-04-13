package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TaurajoBrave_62550 : Card() {
    override val id = 62550
    override val name = "陶拉祖武士"
    override val description = "<b>暴怒：</b>随机消灭一个敌方随从。"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "想想哈斯的人生智慧：“如果你有改变自己身材的机会，你会这么做吗？”"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d22ea7b96fe4464bcf20e4c048426df7c8e9a0c71a43a6aa6fa7d59b4eaf125b.png"
}

package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mindgames_69931 : Card() {
    override val id = 69931
    override val name = "控心术"
    override val description = "随机将你对手的牌库中的一张随从牌的复制置入战场。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "有时候你会觉得，一切不过是场游戏。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b884974ac84bb65888ae9d7ca29ab742e836b660467e5db26f9cceb4c4b8545.png"
}

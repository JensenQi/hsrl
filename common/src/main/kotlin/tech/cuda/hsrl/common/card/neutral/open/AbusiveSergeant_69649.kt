package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AbusiveSergeant_69649 : Card() {
    override val id = 69649
    override val name = "叫嚣的中士"
    override val description = "<b>战吼：</b>在本回合中，使一个随从获得+2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“把我加入你的套牌，白痴！”"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ec6feeae0a9950e2c29ce022f2512b7d9c83a9cd5b5d9f02824ce18e7cbbcf3.png"
}

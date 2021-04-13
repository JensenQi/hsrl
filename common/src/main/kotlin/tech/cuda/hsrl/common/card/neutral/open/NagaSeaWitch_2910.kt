package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NagaSeaWitch_2910 : Card() {
    override val id = 2910
    override val name = "纳迦海巫"
    override val description = "你的卡牌法力值消耗为（5）点。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "要是她把钻研巫术的精神放在学习上该多好。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/513124dce5afe8b54e267971207380202e41d938d69e331cff547ade2710d3ef.png"
}

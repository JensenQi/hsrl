package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MeatWagon_43051 : Card() {
    override val id = 43051
    override val name = "绞肉车"
    override val description = "<b>亡语：</b>从你的牌库中召唤一个攻击力小于该随从攻击力的随从。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "死灵法师管这玩意儿叫“送上门来的肥肉”。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7465f248cf730b1957d4709ed614f5abef06f5adc063e0953c907f49244d0c24.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NerubianProphet_38517 : Card() {
    override val id = 38517
    override val name = "蛛魔先知"
    override val description = "在你的回合开始时，该随从牌的法力值消耗减少（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "不知他的预言里有没有这么一条：被各式各样的玩家反复蹂躏。"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0084bf4a434ce3a8ecb9640158025b7da4a8ca5f99dee8a1c9f4665cdf6a3f55.png"
}

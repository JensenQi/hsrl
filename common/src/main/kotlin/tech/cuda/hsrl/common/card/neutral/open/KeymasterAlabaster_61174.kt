package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeymasterAlabaster_61174 : Card() {
    override val id = 61174
    override val name = "钥匙专家阿拉巴斯特"
    override val description = "每当你的对手抽一张牌时，将一张复制置入你的手牌，其法力值消耗变为（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "成为钥匙专家的关键：多准备复制品。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d488d56f8fc86252c5868cf3194d65cc14c3cd14166c63e601c3e053e0bd492b.png"
}

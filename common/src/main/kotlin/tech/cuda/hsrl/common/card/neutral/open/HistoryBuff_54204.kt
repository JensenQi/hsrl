package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HistoryBuff_54204 : Card() {
    override val id = 54204
    override val name = "历史爱好者"
    override val description = "每当你使用一张随从牌，随机使你手牌中的一张随从牌获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "事实上……当时的情况是……"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e8d2181a5a702630c5b426713b403a6715d73a8f030db9ee6208efbdada8726.png"
}

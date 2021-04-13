package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DwarvenArchaeologist_53343 : Card() {
    override val id = 53343
    override val name = "矮人考古学家"
    override val description = "在你<b>发现</b>一张卡牌后，使其法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "她正在努力偿还攻读高等学位的费用。"
    override val artist = "Danny Dai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7791fabd46e24cf76ce73d5134b88561f270b207e783c857a968edaa035bd60e.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KvaldirRaider_2511 : Card() {
    override val id = 2511
    override val name = "克瓦迪尔劫掠者"
    override val description = "<b>激励：</b>获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "克瓦迪尔劫掠者酷爱打家劫舍，海象人深受其苦。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b457267706a7d3f9edbcc173c5d216222fa815502ad3c8b34eb3c28d888cb296.png"
}

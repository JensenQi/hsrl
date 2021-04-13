package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverVanguard_45287 : Card() {
    override val id = 45287
    override val name = "白银先锋"
    override val description = "<b>亡语：</b> <b>招募</b>一个法力值消耗为（8）的随从。"
    override var cost: Int? = 7
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "像精灵龙一样移动，像虫群女王一样出击。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33fcdfa14944385563368eb52a7706767b1872e70b33e37836d79c64951287c4.png"
}

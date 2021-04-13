package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SinisterDeal_53882 : Card() {
    override val id = 53882
    override val name = "邪恶交易"
    override val description = "<b>发现</b>一张<b>跟班</b>牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“袋子里是什么？”“是……坏家伙。”“好家伙，成交！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d8f00c58baf82d42ed1a563223e777ed5470587a3045184da9c36000acb7844.png"
}

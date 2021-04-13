package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Grandmummy_53933 : Card() {
    override val id = 53933
    override val name = "木奶伊"
    override val description = "<b>复生，亡语：</b>随机使一个友方随从获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "奶奶的爱，永恒的爱。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f32c4969c9a857d332a591e9cdce48774d082ad098af1be4ffaadf40d9211f30.png"
}

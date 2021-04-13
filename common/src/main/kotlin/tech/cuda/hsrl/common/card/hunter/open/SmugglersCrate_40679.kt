package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SmugglersCrate_40679 : Card() {
    override val id = 40679
    override val name = "走私货物"
    override val description = "随机使你手牌中的一张野兽牌获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "污手党声称不对质量问题承担任何责任。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9dc6348a0bfb7f9de9edd26b64559a998d785a5d99d0836d46b3ea49f83fc954.png"
}

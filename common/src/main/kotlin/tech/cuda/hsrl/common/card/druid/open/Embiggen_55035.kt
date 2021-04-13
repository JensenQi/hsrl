package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Embiggen_55035 : Card() {
    override val id = 55035
    override val name = "森然巨化"
    override val description = "使你牌库中的所有随从牌获得+2/+2，且法力值消耗增加（1）点<i>（最高不超过10点）</i>。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "咕长老，收了神通吧！"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/471f766645aae039c17360ee95d8e4dbee5ef09c9deb578bd01589749a492d9c.png"
}

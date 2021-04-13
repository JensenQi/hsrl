package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TidalSurge_41521 : Card() {
    override val id = 41521
    override val name = "海潮涌动"
    override val description = "<b>吸血</b> 对一个随从造成 4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "水流强劲，祛渍无残留。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c1d7af219a36b22c56709cdc3a21150f8900eb35e3d7a2b6f2b0935da658500.png"
}

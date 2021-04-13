package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TidalSurge_69744 : Card() {
    override val id = 69744
    override val name = "海潮涌动"
    override val description = "<b>吸血</b> 对一个随从造成 4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "水流强劲，祛渍无残留。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/377eb77ba961ee7257b96a37fc56df50a156e4f420f65113ada1ce2e4b931c0c.png"
}

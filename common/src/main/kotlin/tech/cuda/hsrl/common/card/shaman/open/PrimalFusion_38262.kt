package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimalFusion_38262 : Card() {
    override val id = 38262
    override val name = "原始融合"
    override val description = "你每有一个图腾，就使一个随从获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "G&D今年又出了一款全新系列的大地图腾，全国各地专柜均有销售。"
    override val artist = "Jimmy Lo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/353ea4142e88b7f1d446f51069a50c0954f653af82090687a98775b313da1c45.png"
}

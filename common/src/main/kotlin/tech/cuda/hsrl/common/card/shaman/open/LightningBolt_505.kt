package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningBolt_505 : Card() {
    override val id = 505
    override val name = "闪电箭"
    override val description = "造成 3点伤害，<b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "闪电箭！闪电箭！闪电箭！"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a44b257ebaf9c6b685cf42944c8f61a495c9f5ca71effb3154c8326304f48ee.png"
}

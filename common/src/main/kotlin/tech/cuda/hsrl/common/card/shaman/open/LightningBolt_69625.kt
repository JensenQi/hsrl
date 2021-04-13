package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningBolt_69625 : Card() {
    override val id = 69625
    override val name = "闪电箭"
    override val description = "造成 3点伤害，<b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "闪电箭！闪电箭！闪电箭！"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d709ad7e3ba1b37ab8732c75865f9ee0c0bcf434f8845c356565038c64dd1fc.png"
}

package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningBolt_69892 : Card() {
    override val id = 69892
    override val name = "闪电箭"
    override val description = "造成 3点伤害，<b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "闪电箭！闪电箭！闪电箭！"
    override val artist = "Daarken"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b0d9deb0d5f36932747c771aee0e012143780cda456b672c4a95cc71208c9ef.png"
}

package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GiftOfTheWild_54833 : Card() {
    override val id = 54833
    override val name = "野性赐福"
    override val description = "使你的所有随从获得+2/+2和 <b>嘲讽</b>。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "可以让你活下去的赐福。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d19079bdc64d4efa23b6e1f6019ea6fb9e0e7f61dae4a0d6d438573f1c9cf490.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExcavatedEvil_2999 : Card() {
    override val id = 2999
    override val name = "极恶之咒"
    override val description = "对所有随从造成 3点伤害。将该牌洗入你对手的牌库。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Loe
    override val background = "即便是手痒的雷诺·杰克逊也对此心存敬畏。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/087b4a60769b8b460c24bec19a99317a97a2d86d08d4fe02f85d40a263ae22ae.png"
}

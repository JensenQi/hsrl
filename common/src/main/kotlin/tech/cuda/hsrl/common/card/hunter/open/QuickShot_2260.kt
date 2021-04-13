package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuickShot_2260 : Card() {
    override val id = 2260
    override val name = "快速射击"
    override val description = "造成 3点伤害。 如果你没有其他手牌，则抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Brm
    override val background = "光有神射手还不够，你需要一个神抽手。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a56532753980141401eb90fbd3977e2a843384a045bdf997bca397e354223eb.png"
}

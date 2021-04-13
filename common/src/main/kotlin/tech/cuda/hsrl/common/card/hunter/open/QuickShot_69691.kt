package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuickShot_69691 : Card() {
    override val id = 69691
    override val name = "快速射击"
    override val description = "造成 3点伤害。 如果你没有其他手牌，则抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "光有神射手还不够，你需要一个神抽手。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f1ffac564fbd36bcab4e98d9202deecba9ea477c0fae805c9cf1e24de61ee0ab.png"
}

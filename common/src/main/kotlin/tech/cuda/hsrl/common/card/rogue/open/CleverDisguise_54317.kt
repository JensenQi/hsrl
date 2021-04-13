package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CleverDisguise_54317 : Card() {
    override val id = 54317
    override val name = "聪明的伪装"
    override val description = "随机将另一职业的两张法术牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“是我！托瓦格尔！”"
    override val artist = "Ekaterina Shapovalova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb3a212b7fbba62dab3d768563fa2edd873ea2e80a5e58ad4cb59793306cd2b0.png"
}

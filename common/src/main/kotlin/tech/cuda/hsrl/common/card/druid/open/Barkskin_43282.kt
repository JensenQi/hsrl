package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Barkskin_43282 : Card() {
    override val id = 43282
    override val name = "树皮术"
    override val description = "使一个随从 获得+3生命值。 获得3点护甲值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "就像长了盔甲的树。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01e305fa13216f8f4e4927d04dd33d03050752bce0f74ce80e82f3b930e15a13.png"
}

package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Fireball_69501 : Card() {
    override val id = 69501
    override val name = "火球术"
    override val description = "造成 6点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "这个法术会让东西烧起来。如果你是在寻找能把东西烤熟，或者只是加热的法术，你就找错对象了。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e8fc80b64b65b177a715fc6429e4613a68c031ad41dd3414fe62cecf18d3c10.png"
}

package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Fireball_315 : Card() {
    override val id = 315
    override val name = "火球术"
    override val description = "造成 6点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "这个法术会让东西烧起来。如果你是在寻找能把东西烤熟，或者只是加热的法术，你就找错对象了。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b78ed206e7e9892bcda3caff1a88bc37727a6972b9e31058d80cf3f7a366e88c.png"
}

package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MirrorImage_68325 : Card() {
    override val id = 68325
    override val name = "镜像"
    override val description = "召唤两个0/2，并具有<b>嘲讽</b>的随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "哦，嘿，这是个镜像！！像镜个是这，嘿，哦"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f266d9ee7d28f658e607fe34f518548b2ac2674f60cd0b97a049160ab04187e.png"
}

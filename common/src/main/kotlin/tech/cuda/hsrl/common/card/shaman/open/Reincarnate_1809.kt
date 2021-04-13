package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Reincarnate_1809 : Card() {
    override val id = 1809
    override val name = "转生"
    override val description = "消灭一个随从，然后将其复活，并具有所有生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Naxx
    override val background = "这和出生时没什么两样，除了你生下来就是个成年人，除了你一秒钟之前还是个死人。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c242f19f20c352ade84ee295f827c11e49ba7b695e022e311572b2329690527.png"
}

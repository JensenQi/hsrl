package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForceOfNature_493 : Card() {
    override val id = 493
    override val name = "自然之力"
    override val description = "召唤三个2/2的树人。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "“我想我可以在这片树荫下打个盹儿。等等...啊啊啊啊啊！”——不幸的侏儒布林克菲兹"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e2fb0207e3632e1d4d055718b20023a7d5e23d5fecf122b6ef420be9a1d5919.png"
}

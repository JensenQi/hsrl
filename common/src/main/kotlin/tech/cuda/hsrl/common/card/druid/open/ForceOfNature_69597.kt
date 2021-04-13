package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForceOfNature_69597 : Card() {
    override val id = 69597
    override val name = "自然之力"
    override val description = "召唤三个2/2的树人。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "“我想我可以在这片树荫下打个盹儿。等等...啊啊啊啊啊！”——不幸的侏儒布林克菲兹"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef558b7ffe2806c2cf9534497098019116b9493486a83d65248c1553c7d231d1.png"
}

package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForceOfNature_70981 : Card() {
    override val id = 70981
    override val name = "自然之力"
    override val description = "召唤三个2/2并具有<b>冲锋</b>的树人，在回合结束时，消灭这些树人。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "“我想我可以在这片树荫下打个盹儿。等等...啊啊啊啊啊！”——不幸的侏儒布林克菲兹"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/48f6f57457067ac9640277270c15c204527d380db9906bc35102580f9e2e2a6d.png"
}

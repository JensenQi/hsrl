package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordFeast_59572 : Card() {
    override val id = 59572
    override val name = "真言术：宴"
    override val description = "使一个随从获得+2/+2。在本回合结束时，使其恢复所有生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "有些人入学是为了举世闻名的学术项目，有些人则是为了吃自助。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19f1859c56579ffe113c071008aa383292f663f106387bf3f3dff7bdfb3394fd.png"
}

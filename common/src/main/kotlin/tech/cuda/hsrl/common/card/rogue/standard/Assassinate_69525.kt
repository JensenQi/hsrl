package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Assassinate_69525 : Card() {
    override val id = 69525
    override val name = "刺杀"
    override val description = "消灭一个敌方随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "要是你不想被人暗杀，躲到贫瘠之地，然后隐姓埋名。祝你好运！"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78169eab0be138fc64627fc958eed63bb6f19773958eb6964af7a8d1c35a9451.png"
}

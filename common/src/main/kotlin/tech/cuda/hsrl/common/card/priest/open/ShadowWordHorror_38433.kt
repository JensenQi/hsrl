package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordHorror_38433 : Card() {
    override val id = 38433
    override val name = "暗言术：骇"
    override val description = "消灭所有攻击力小于或等于2的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "其实并没有被消灭，而是被吸入无尽的虚空之中。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc505249acd566cad449630d429caeba7f7fef941631ae73bed6422c22dfcb28.png"
}

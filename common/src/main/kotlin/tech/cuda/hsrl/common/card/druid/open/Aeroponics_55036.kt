package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Aeroponics_55036 : Card() {
    override val id = 55036
    override val name = "空气栽培"
    override val description = "抽两张牌。你每控制一个树人，该牌的法力值消耗便减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "优秀的种子总能广为流传。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1faf372f537fe45469a4a7e46fb521408b851453cf34a094a5e3054967b1a9ed.png"
}

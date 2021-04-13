package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LunarVisions_40615 : Card() {
    override val id = 40615
    override val name = "新月视界"
    override val description = "抽两张牌，抽到的随从牌法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "其实…月亮上没什么好看的。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b5d1a346b527e21432bab7589f15a169ec9024ac51379f65b144a8ed8865904e.png"
}

package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dinomancy_41363 : Card() {
    override val id = 41363
    override val name = "恐龙学"
    override val description = "你的英雄技能变成“使一个野兽获得+2/+2”。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "那些喜欢研究恐龙的人，多半都成了恐龙的晚餐。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d8db6a480f6ff70f4e54549aadf62da6487867aa5fc61cb72c28bc7501237210.png"
}

package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Metamorphosis_56899 : Card() {
    override val id = 56899
    override val name = "恶魔变形"
    override val description = "将你的英雄技能替换为“造成4点伤害。”使用两次后，换回原技能。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "正如卑微的毛虫可以羽化成蝶，一个恶魔猎手也可以变成一尊散发着毁灭与混沌的庞然大物。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e96f0770d1c7d38b5c0b2a8d0c180dfd3b096d7ab3cc76e76f6297ce0d3a6c6a.png"
}

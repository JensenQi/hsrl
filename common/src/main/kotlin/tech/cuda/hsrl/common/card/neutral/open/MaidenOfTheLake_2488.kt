package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MaidenOfTheLake_2488 : Card() {
    override val id = 2488
    override val name = "湖之仙女"
    override val description = "你的英雄技能的法力值消耗为（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "传闻她手中持的便是亚瑟王的断钢剑。"
    override val artist = "Froilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b41db2a781deb9aafcd2b02e446c2d11b01ac34266607293cb6d1cb29c7826f0.png"
}

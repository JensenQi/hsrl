package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BiologyProject_47887 : Card() {
    override val id = 47887
    override val name = "生物计划"
    override val description = "每个玩家获得两个法力水晶。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "第一步，种超大颗的草莓；第二步，不可描述；第三步，统治艾泽拉斯！"
    override val artist = "J. Paick & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19b048c5482cc9ad58d2a7b1a5302d31de442032f485c93faa403d78951b3856.png"
}

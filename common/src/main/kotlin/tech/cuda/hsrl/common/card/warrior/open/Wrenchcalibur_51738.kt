package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wrenchcalibur_51738 : Card() {
    override val id = 51738
    override val name = "圣剑扳手"
    override val description = "在你的英雄攻击后，将一张“炸弹”牌洗入你对手的牌库。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "谁能从工具箱中拔出这支扳手，谁就是实验室的合法主任。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79c59044874123309a8953082fda8f2fc2100122b16d61e60c8c87b46304a51a.png"
}

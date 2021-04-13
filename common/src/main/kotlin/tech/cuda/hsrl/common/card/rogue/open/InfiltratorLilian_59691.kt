package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InfiltratorLilian_59691 : Card() {
    override val id = 59691
    override val name = "渗透者莉莉安"
    override val description = "<b>潜行，亡语：</b>召唤一个4/2的被遗忘者莉莉安，并使其随机攻击一个敌人。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "她决心彻查此地，哪怕要付出生命的代价，付两次！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8d5ca153dbe88f30df3a63c9ad4c9048e8be63926b15d0ac654e08f1bfedcdb2.png"
}

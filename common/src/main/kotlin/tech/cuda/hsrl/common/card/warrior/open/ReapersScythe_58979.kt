package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ReapersScythe_58979 : Card() {
    override val id = 58979
    override val name = "收割之镰"
    override val description = "<b>法术迸发：</b>在本回合中同时对攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "死吧，死吧，死吧。"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f817379a56a40f23f584ca92f33fcbf51e6e991dd61789ad29e2614ce52df2df.png"
}

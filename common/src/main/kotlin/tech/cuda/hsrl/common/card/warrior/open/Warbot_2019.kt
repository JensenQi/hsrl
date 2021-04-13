package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Warbot_2019 : Card() {
    override val id = 2019
    override val name = "战斗机器人"
    override val description = "受伤时具有+1攻 击力。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "战斗机器人的量产计划因为其“样本产品”的体型过大而流产。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8274351bbf24852f4dfe4405c37c924a2adf328309017b9e87f3b4ad3db7306e.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CultMaster_811 : Card() {
    override val id = 811
    override val name = "诅咒教派领袖"
    override val description = "在一个友方随从死亡后，抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "也许她是个邪恶的教派领袖，但是每个星期她都会和她的父母通电话。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57e390003913b1dcdb17e4ce2a2f0dfcb9f684ba2c47266f473d86bc35d9404d.png"
}

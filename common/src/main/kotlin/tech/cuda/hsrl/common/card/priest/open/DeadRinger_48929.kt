package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadRinger_48929 : Card() {
    override val id = 48929
    override val name = "丧钟机器人"
    override val description = "<b>亡语：</b>从你的牌库中抽一张具有<b>亡语</b>的随从牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "砰砰博士的得力助手。精通枪术剑术，拥有惊人的恢复能力。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58e88759df4af5479205803c9ce136d510f9b215b1b67329573471e02c29d410.png"
}

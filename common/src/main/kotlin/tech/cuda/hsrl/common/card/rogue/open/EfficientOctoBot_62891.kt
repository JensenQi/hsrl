package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EfficientOctoBot_62891 : Card() {
    override val id = 62891
    override val name = "高效八爪机器人"
    override val description = "<b>暴怒：</b>你的手牌法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "拉动操纵杆，八爪机器人……操纵杆错误！"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/506a545bb0405cf7d445411dbae4b92de57cb2bc122ebc4b32d06606d7434803.png"
}

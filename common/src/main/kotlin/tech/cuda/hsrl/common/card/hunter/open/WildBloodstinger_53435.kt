package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WildBloodstinger_53435 : Card() {
    override val id = 53435
    override val name = "刺血狂蝎"
    override val description = "<b>战吼：</b>从你对手的手牌中召唤一个随从。攻击该随从。"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“别是石皮蜥蜴，别是石皮蜥蜴，别是……”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b339c62b1405192cc1ac03f319146c31bc6fdebd16bedd8c696791201fec150.png"
}

package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TeachersPet_59026 : Card() {
    override val id = 59026
    override val name = "教师的爱宠"
    override val description = "<b>嘲讽，亡语：</b>随机召唤一只法力值消耗为（3）的野兽。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "不是干活这只，是会说话那只。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/858941694e6104442866037e22ada99312402ac3e8ec79a2582d7f7484341823.png"
}

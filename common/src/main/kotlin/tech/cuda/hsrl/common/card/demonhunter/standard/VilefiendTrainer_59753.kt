package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VilefiendTrainer_59753 : Card() {
    override val id = 59753
    override val name = "邪犬训练师"
    override val description = "<b>流放：</b>召唤两个1/1的恶魔。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "我的训练师给了我一双新跑鞋，比我的Air Gul'dan强多了！"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c3063e62b880e0eebee409802eb377845ec0ac417c6aef74e60a71a5910e3d0.png"
}

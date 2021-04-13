package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloatedPython_59188 : Card() {
    override val id = 59188
    override val name = "饱腹巨蟒"
    override val description = "<b>亡语：</b>召唤一个4/4的倒霉的管理员。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "import 倒霉的管理员 print ('已获取管理员权限')"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/219f8a12e7f473d12e24b5c0ed4f9793c1011a516626ef429ea71cf4fc0b57ef.png"
}

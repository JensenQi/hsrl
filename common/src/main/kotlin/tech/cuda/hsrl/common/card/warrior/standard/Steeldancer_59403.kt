package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Steeldancer_59403 : Card() {
    override val id = 59403
    override val name = "钢铁舞者"
    override val description = "<b>战吼：</b>随机召唤一个法力值消耗等同于你的武器攻击力的随从。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "刀尖之舞，最为致命。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6aa45410d3120876e902899ccf7a936d6cde71872f7e27149394682876179a56.png"
}

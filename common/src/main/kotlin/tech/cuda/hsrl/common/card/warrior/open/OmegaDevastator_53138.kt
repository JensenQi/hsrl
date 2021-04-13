package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OmegaDevastator_53138 : Card() {
    override val id = 53138
    override val name = "欧米茄毁灭者"
    override val description = "<b>战吼：</b>如果你有十个法力水晶，对一个随从造成10点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "阿尔法毁灭者力道不足，贝塔毁灭者功率太大。只有欧米茄毁灭者刚好合适！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66407a72183ae6a5df9d1b062f10e7485e27e8a10985dc307cf358f9bd408020.png"
}

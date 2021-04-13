package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodRazor_42700 : Card() {
    override val id = 42700
    override val name = "血刃剃刀"
    override val description = "<b>战吼，亡语：</b> 对所有随从造成 1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "实在是居家旅行，杀人灭口之必备佳品。刀刃锋利，请注意安全。"
    override val artist = "Joe Wilson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f936c149c6ff9fac12a4fe05d01ac381d2a23c2a1cd72e81e5d6e35099239e08.png"
}

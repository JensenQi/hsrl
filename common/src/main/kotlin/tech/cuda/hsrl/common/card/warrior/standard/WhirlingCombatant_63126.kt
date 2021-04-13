package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhirlingCombatant_63126 : Card() {
    override val id = 63126
    override val name = "旋风争斗者"
    override val description = "<b>战吼，暴怒：</b> 对所有其他随从造成1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "这就是卡波耶拉腿法！对，很危险！"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a6f30f7ebc16f193861d6b5b1541a014a16e9fa874447e18245e2caf607c23d.png"
}
